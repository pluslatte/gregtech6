/**
 * Copyright (c) 2018 Gregorius Techneticies
 *
 * This file is part of GregTech.
 *
 * GregTech is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GregTech is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GregTech. If not, see <http://www.gnu.org/licenses/>.
 */

package gregtech.tileentity.tools;

import static gregapi.data.CS.*;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;

/**
 * @author Gregorius Techneticies
 */
public class MultiTileEntityBathingPotTableWood extends MultiTileEntityBathingPotWood {
	@Override
	public int getRenderPasses2(Block aBlock, boolean[] aShouldSideBeRendered) {
		return 8;
	}
	
	@Override
	public boolean setBlockBounds2(Block aBlock, int aRenderPass, boolean[] aShouldSideBeRendered) {
		switch(aRenderPass) {
		case  0: box(aBlock, PX_P[ 0], PX_P[ 8], PX_P[ 0], PX_N[14], PX_N[ 0], PX_N[ 0]); return T;
		case  1: box(aBlock, PX_P[ 0], PX_P[ 8], PX_P[ 0], PX_N[ 0], PX_N[ 0], PX_N[14]); return T;
		case  2: box(aBlock, PX_P[14], PX_P[ 8], PX_P[ 0], PX_N[ 0], PX_N[ 0], PX_N[ 0]); return T;
		case  3: box(aBlock, PX_P[ 0], PX_P[ 8], PX_P[14], PX_N[ 0], PX_N[ 0], PX_N[ 0]); return T;
		case  4: box(aBlock, PX_P[ 0], PX_P[ 8], PX_P[ 0], PX_N[ 0], PX_N[ 6], PX_N[ 0]); return T;
		case  5: box(aBlock, PX_P[ 0], PX_P[ 8], PX_P[ 0], PX_N[ 0], PX_N[ 1], PX_N[ 0]); return T;
		case  6: box(aBlock, PX_P[ 0], PX_P[ 8], PX_P[ 0], PX_N[14], PX_N[ 0]+0.001F, PX_N[14]); return T;
		case  7: box(aBlock, PX_P[ 0], PX_P[ 0], PX_P[ 0], PX_N[ 0], PX_N[ 8], PX_N[ 0]); return T;
		}
		return F;
	}
	
	@Override
	public void addCollisionBoxesToList2(AxisAlignedBB aAABB, List<AxisAlignedBB> aList, Entity aEntity) {
		box(aAABB, aList, PX_P[14], PX_P[ 8], PX_P[ 0], PX_N[ 0], PX_N[ 0], PX_N[ 0]);
		box(aAABB, aList, PX_P[ 0], PX_P[ 8], PX_P[14], PX_N[ 0], PX_N[ 0], PX_N[ 0]);
		box(aAABB, aList, PX_P[ 0], PX_P[ 8], PX_P[ 0], PX_N[14], PX_N[ 0], PX_N[ 0]);
		box(aAABB, aList, PX_P[ 0], PX_P[ 8], PX_P[ 0], PX_N[ 0], PX_N[ 0], PX_N[14]);
		box(aAABB, aList, PX_P[ 0], PX_P[ 0], PX_P[ 0], PX_N[ 0], PX_N[ 6], PX_N[ 0]);
	}
	
	@Override public boolean addDefaultCollisionBoxToList() {return F;}
	@Override public AxisAlignedBB getCollisionBoundingBoxFromPool() {return box(PX_P[ 0], PX_P[ 0], PX_P[ 0], PX_N[ 0], PX_N[ 0], PX_N[ 0]);}
	@Override public AxisAlignedBB getSelectedBoundingBoxFromPool () {return box(PX_P[ 0], PX_P[ 0], PX_P[ 0], PX_N[ 0], PX_N[ 0], PX_N[ 0]);}
	@Override public void setBlockBoundsBasedOnState(Block aBlock) {box(aBlock, PX_P[ 0], PX_P[ 0], PX_P[ 0], PX_N[ 0], PX_N[ 0], PX_N[ 0]);}
	
	@Override public float getSurfaceSize			(byte aSide) {return 1.0F;}
	@Override public float getSurfaceSizeAttachable	(byte aSide) {return 1.0F;}
	@Override public float getSurfaceDistance		(byte aSide) {return 0.0F;}
	@Override public boolean isSurfaceSolid			(byte aSide) {return SIDES_BOTTOM_HORIZONTAL[aSide];}
	@Override public boolean isSurfaceOpaque2		(byte aSide) {return SIDES_BOTTOM_HORIZONTAL[aSide];}
	@Override public boolean isSideSolid2			(byte aSide) {return SIDES_BOTTOM_HORIZONTAL[aSide];}
	@Override public boolean allowCovers			(byte aSide) {return F;}
	@Override public boolean attachCoversFirst		(byte aSide) {return F;}
	
	@Override public String getTileEntityName() {return "gt.multitileentity.bathing.pot.table.wood";}
}
