/**
 * 
 */
package cn.jbit.epetShop.model;

import cn.jbit.epetShop.entity.Pet;

//宠物培育，培育新宠物
public interface PetFactory {
	
	public Pet breadNewPet(String[] petParam);
}
