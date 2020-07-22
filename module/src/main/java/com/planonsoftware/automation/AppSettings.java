package com.planonsoftware.automation;

import java.util.Date;

import com.planonsoftware.app.platform.settings.v1.Settings;
import com.planonsoftware.app.platform.settings.v1.attribute.Description;

@Settings("App settings")
public interface AppSettings
{
    @Description("Date time setting")
    Date dateTimeValue();
}
