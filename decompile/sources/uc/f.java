package uc;

import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes.dex */
public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);


    /* renamed from: x, reason: collision with root package name */
    public final String f13087x;

    f(String str) {
        this.f13087x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13087x;
    }
}
