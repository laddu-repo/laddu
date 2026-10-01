package com.unity3d.services.core.log;

import h8.c;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class DeviceLogEntry {
    private DeviceLogLevel _logLevel;
    private String _originalMessage;
    private StackTraceElement _stackTraceElement;

    public DeviceLogEntry(DeviceLogLevel deviceLogLevel, String str, StackTraceElement stackTraceElement) {
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public String getParsedMessage() {
        String str;
        String str2;
        int i6;
        String str3 = this._originalMessage;
        StackTraceElement stackTraceElement = this._stackTraceElement;
        if (stackTraceElement != null) {
            str = stackTraceElement.getClassName();
            str2 = this._stackTraceElement.getMethodName();
            i6 = this._stackTraceElement.getLineNumber();
        } else {
            str = "UnknownClass";
            str2 = "unknownMethod";
            i6 = -1;
        }
        if (str3 != null && !str3.isEmpty()) {
            str3 = " :: ".concat(str3);
        }
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str + "." + str2 + "()" + c.j(i6, " (line:", ")") + str3;
    }
}
