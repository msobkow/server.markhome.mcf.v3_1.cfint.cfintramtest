
// Description: Spring Ram storage tests for CFSec for the RamTest program

/*
 *	io.github.msobkow.CFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal 3.1 CFInt - Internet Essentials
 *	
 *	This file is part of Mark's Code Fractal CFInt.
 *	
 *	Mark's Code Fractal CFInt is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU Library General Public License,
 *	Version 3 or later.
 *	
 *	Mark's Code Fractal CFInt is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU Library General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFInt is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU Library General Public License
 *	along with Mark's Code Fractal CFInt.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes in order to
 *	tie it to proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *	
 */

package io.github.msobkow.v3_1.cfint.cfintramtest.spring;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

import io.github.msobkow.v3_1.cflib.*;
import io.github.msobkow.v3_1.cflib.dbutil.*;
import io.github.msobkow.v3_1.cfsec.cfsec.*;
import io.github.msobkow.v3_1.cfsec.cfsec.buff.*;
import io.github.msobkow.v3_1.cfsec.cfsecram.*;

@Service("RamTestCFSec")
public class CFSecRamTestTestSchema {
    
    public String performTests(EntityManager em) {
		StringBuffer messages = new StringBuffer("Starting CFSec tests...\n");
		ICFSecCluster[] clusterResults = ICFSecSchema.getBackingCFSec().getTableCluster().readAllDerived(null);
		if (clusterResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getClusterTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + clusterResults.length + " entities from CFSec.Cluster\n");
		}

		ICFSecHostNode[] hostNodeResults = ICFSecSchema.getBackingCFSec().getTableHostNode().readAllDerived(null);
		if (hostNodeResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getHostNodeTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + hostNodeResults.length + " entities from CFSec.HostNode\n");
		}

		ICFSecISOCcy[] iSOCcyResults = ICFSecSchema.getBackingCFSec().getTableISOCcy().readAllDerived(null);
		if (iSOCcyResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getISOCcyTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + iSOCcyResults.length + " entities from CFSec.ISOCcy\n");
		}

		ICFSecISOCtry[] iSOCtryResults = ICFSecSchema.getBackingCFSec().getTableISOCtry().readAllDerived(null);
		if (iSOCtryResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getISOCtryTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + iSOCtryResults.length + " entities from CFSec.ISOCtry\n");
		}

		ICFSecISOCtryCcy[] iSOCtryCcyResults = ICFSecSchema.getBackingCFSec().getTableISOCtryCcy().readAllDerived(null);
		if (iSOCtryCcyResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getISOCtryCcyTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + iSOCtryCcyResults.length + " entities from CFSec.ISOCtryCcy\n");
		}

		ICFSecISOCtryLang[] iSOCtryLangResults = ICFSecSchema.getBackingCFSec().getTableISOCtryLang().readAllDerived(null);
		if (iSOCtryLangResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getISOCtryLangTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + iSOCtryLangResults.length + " entities from CFSec.ISOCtryLang\n");
		}

		ICFSecISOLang[] iSOLangResults = ICFSecSchema.getBackingCFSec().getTableISOLang().readAllDerived(null);
		if (iSOLangResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getISOLangTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + iSOLangResults.length + " entities from CFSec.ISOLang\n");
		}

		ICFSecISOTZone[] iSOTZoneResults = ICFSecSchema.getBackingCFSec().getTableISOTZone().readAllDerived(null);
		if (iSOTZoneResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getISOTZoneTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + iSOTZoneResults.length + " entities from CFSec.ISOTZone\n");
		}

		ICFSecSecDevice[] secDeviceResults = ICFSecSchema.getBackingCFSec().getTableSecDevice().readAllDerived(null);
		if (secDeviceResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getSecDeviceTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + secDeviceResults.length + " entities from CFSec.SecDevice\n");
		}

		ICFSecSecGroup[] secGroupResults = ICFSecSchema.getBackingCFSec().getTableSecGroup().readAllDerived(null);
		if (secGroupResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getSecGroupTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + secGroupResults.length + " entities from CFSec.SecGroup\n");
		}

		ICFSecSecGrpInc[] secGrpIncResults = ICFSecSchema.getBackingCFSec().getTableSecGrpInc().readAllDerived(null);
		if (secGrpIncResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getSecGrpIncTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + secGrpIncResults.length + " entities from CFSec.SecGrpInc\n");
		}

		ICFSecSecGrpMemb[] secGrpMembResults = ICFSecSchema.getBackingCFSec().getTableSecGrpMemb().readAllDerived(null);
		if (secGrpMembResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getSecGrpMembTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + secGrpMembResults.length + " entities from CFSec.SecGrpMemb\n");
		}

		ICFSecSecSession[] secSessionResults = ICFSecSchema.getBackingCFSec().getTableSecSession().readAllDerived(null);
		if (secSessionResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getSecSessionTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + secSessionResults.length + " entities from CFSec.SecSession\n");
		}

		ICFSecSecUser[] secUserResults = ICFSecSchema.getBackingCFSec().getTableSecUser().readAllDerived(null);
		if (secUserResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getSecUserTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + secUserResults.length + " entities from CFSec.SecUser\n");
		}

		ICFSecService[] serviceResults = ICFSecSchema.getBackingCFSec().getTableService().readAllDerived(null);
		if (serviceResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getServiceTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + serviceResults.length + " entities from CFSec.Service\n");
		}

		ICFSecServiceType[] serviceTypeResults = ICFSecSchema.getBackingCFSec().getTableServiceType().readAllDerived(null);
		if (serviceTypeResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getServiceTypeTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + serviceTypeResults.length + " entities from CFSec.ServiceType\n");
		}

		ICFSecSysCluster[] sysClusterResults = ICFSecSchema.getBackingCFSec().getTableSysCluster().readAllDerived(null);
		if (sysClusterResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getSysClusterTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + sysClusterResults.length + " entities from CFSec.SysCluster\n");
		}

		ICFSecTenant[] tenantResults = ICFSecSchema.getBackingCFSec().getTableTenant().readAllDerived(null);
		if (tenantResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getTenantTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + tenantResults.length + " entities from CFSec.Tenant\n");
		}

		ICFSecTSecGroup[] tSecGroupResults = ICFSecSchema.getBackingCFSec().getTableTSecGroup().readAllDerived(null);
		if (tSecGroupResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getTSecGroupTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + tSecGroupResults.length + " entities from CFSec.TSecGroup\n");
		}

		ICFSecTSecGrpInc[] tSecGrpIncResults = ICFSecSchema.getBackingCFSec().getTableTSecGrpInc().readAllDerived(null);
		if (tSecGrpIncResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getTSecGrpIncTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + tSecGrpIncResults.length + " entities from CFSec.TSecGrpInc\n");
		}

		ICFSecTSecGrpMemb[] tSecGrpMembResults = ICFSecSchema.getBackingCFSec().getTableTSecGrpMemb().readAllDerived(null);
		if (tSecGrpMembResults == null) {
			messages.append("Erroneously retrieved null for ICFSecSchema.getTSecGrpMembTable().readAllDerived(null)\n");
		}
		else {
			messages.append("Retrieved " + tSecGrpMembResults.length + " entities from CFSec.TSecGrpMemb\n");
		}

		messages.append("CFSec tests complete\n");
		return( messages.toString() );
	}
}
