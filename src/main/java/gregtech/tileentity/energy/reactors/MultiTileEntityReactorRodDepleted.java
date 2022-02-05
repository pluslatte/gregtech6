/**
 * Copyright (c) 2019 Gregorius Techneticies
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

package gregtech.tileentity.energy.reactors;

import java.util.List;

import gregapi.data.LH;
import net.minecraft.item.ItemStack;

/**
 * @author Gregorius Techneticies
 */
public class MultiTileEntityReactorRodDepleted extends MultiTileEntityReactorRodBase {
	@Override
	public void addToolTips(List<String> aList, ItemStack aStack, boolean aF3_H) {
		aList.add(LH.Chat.DGRAY + "Used in Nuclear Reactor Core");
		aList.add(LH.Chat.CYAN + "This Rod is " + LH.Chat.RED + "Depleted" + LH.Chat.CYAN + " and will not output or accept any Neutrons");
		aList.add(LH.Chat.CYAN + "Can be centrifuged to get valuable materials");
	}
	
	@Override public String getTileEntityName() {return "gt.multitileentity.generator.reactor.rods.depleted";}
}
