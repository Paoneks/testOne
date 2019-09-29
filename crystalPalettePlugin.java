package com.crystal.wc.color;

import com.lcs.wc.color.LCSPalette;
import com.lcs.wc.load.LoadCommon;
import wt.fc.WTObject;
import wt.util.WTException;
import wt.util.WTPropertyVetoException;

public class crystalPalettePlugin
{
  public static String paletteName = null;
  public static final String PALETTE_NAME_KEY = "name";
  public static String subPaletteName = null;

  public static void modifyPaletteName(WTObject obj) throws WTPropertyVetoException
  {
    try
    {
      LCSPalette paletteObj = (LCSPalette)obj;

      paletteName = (String)paletteObj.getValue("name");

      subPaletteName = (String)paletteObj.getValue("cvSubPaletteDescription");
      if (subPaletteName != null)
      {
        StringBuffer sb = new StringBuffer();
        sb.append(paletteName);
        sb.append(" ");
        sb.append("-");
        sb.append(" ");
        sb.append(subPaletteName);
        paletteObj.setValue("name", sb.toString());
      }
    }
    catch (WTException ex)
    {
      LoadCommon.display("/###################### WTException in Specfication name customisation ######################/\n" + ex.getLocalizedMessage());
    }
  }
}