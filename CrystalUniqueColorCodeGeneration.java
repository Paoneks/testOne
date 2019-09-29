package com.crystal.wc.color;

import wt.fc.WTObject;					   
import wt.fc.PersistenceHelper;			   
import wt.util.WTException;				  
import wt.util.WTPropertyVetoException;	   

import com.lcs.wc.color.LCSColor;         
import com.lcs.wc.flextype.FlexType;
import com.lcs.wc.foundation.LCSLogic;    
import com.lcs.wc.util.FormatHelper;	   
import com.lcs.wc.util.LCSProperties;

/**
 * This CrystalUniqueColorCodeGeneration class is used for Color Code Generation
 * @author Jeyaganeshan R
 * @version 1.0
 */
public class CrystalUniqueColorCodeGeneration
{
	private static String ColorGroupName="";
	private static String ColorCode="";

	static
	{
	  ColorGroupName=LCSProperties.get("com.crystal.wc.color.CrystalUniqueColorCodeGeneration.setUniqueColorCode.ColorGroupName");
	  ColorCode=LCSProperties.get("com.crystal.wc.color.CrystalUniqueColorCodeGeneration.setUniqueColorCode.ColorCode");
	}

	/**This setUniqueColorCode method generates unique color code based on the group selected
	 * @param obj
	 * @throws WTException
	 * @throws WTPropertyVetoException
	 */
	 @SuppressWarnings("deprecation")
	public static void setUniqueColorCode(WTObject obj) throws WTException,WTPropertyVetoException
	{
	 if(obj instanceof LCSColor)
	 {
	   String strColorGroupNameKey="";      
	   String strColorGroupNameValue="";   
	   String strColorCode="";			 
		 
	LCSColor colorObj = (LCSColor) obj;
	FlexType colorFlexType= colorObj.getFlexType();  
	strColorGroupNameKey=(String)colorObj.getValue(ColorGroupName);   
    strColorGroupNameValue = colorFlexType.getAttribute(ColorGroupName).getAttValueList().getValue(strColorGroupNameKey,com.lcs.wc.client.ClientContext.getContext().getLocale());
		
		 if(FormatHelper.hasContent(strColorGroupNameValue))
			{       
				if("Yellow".equalsIgnoreCase(strColorGroupNameValue))				 // Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("YellowColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);   
				}
			    else if("Orange".equalsIgnoreCase(strColorGroupNameValue))			// Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("OrangeColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("Red".equalsIgnoreCase(strColorGroupNameValue))				// Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("RedColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("Purple".equalsIgnoreCase(strColorGroupNameValue))			// Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("PurpleColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("Blue".equalsIgnoreCase(strColorGroupNameValue))			// Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("BlueColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("Green".equalsIgnoreCase(strColorGroupNameValue))			// Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("GreenColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("Black or Grey".equalsIgnoreCase(strColorGroupNameValue))   // Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("GrayColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("Brown or Cream".equalsIgnoreCase(strColorGroupNameValue))  // Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("BrownColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("White".equalsIgnoreCase(strColorGroupNameValue))			// Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("WhiteColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
				else if("Dyed and Print".equalsIgnoreCase(strColorGroupNameValue))  // Condition to select the Group Sequence based on the group name selected
				{
					strColorCode = strColorGroupNameValue.concat(PersistenceHelper.manager.getNextSequence("DyedandPrintColorGrpSequence"));
					colorObj.setValue(ColorCode,strColorCode);
				}
			}
			LCSLogic.persist(colorObj,true);   
		}
     }
}
