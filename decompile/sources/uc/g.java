package uc;

/* loaded from: classes.dex */
public enum g {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* renamed from: x, reason: collision with root package name */
    public final String f13090x;

    g(String str) {
        this.f13090x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13090x;
    }
}
