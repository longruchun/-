/**
 * 
 */
package cn.jbit.epetShop.model;

import cn.jbit.epetShop.entity.Pet;

//���������������³���
public interface PetFactory {
	
	public Pet breadNewPet(String[] petParam);
}
