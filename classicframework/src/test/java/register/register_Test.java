package register;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class register_Test extends BaseClass{
	@Test
	public void RegisterToDemowebshop() {
		Register.getRegLinkText().click();
		Register.getGenderRB().click();
		Register.getFirstNameTF().sendKeys("sai kumar");
		Register.getLastNameTF().sendKeys("muddana");
		Register.getPassTF().sendKeys("Sai@1432");
		Register.getConfpassTF().sendKeys("Sai@1432");
		Register.getRegbutton().click();
	}

}