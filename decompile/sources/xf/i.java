package xf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14735a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14736b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14737c;

    /* renamed from: d, reason: collision with root package name */
    public final a f14738d;

    public i(boolean z10, boolean z11, boolean z12, a classDiscriminatorMode) {
        kotlin.jvm.internal.k.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f14735a = z10;
        this.f14736b = z11;
        this.f14737c = z12;
        this.f14738d = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f14735a + ", ignoreUnknownKeys=" + this.f14736b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='    ', coerceInputValues=" + this.f14737c + ", useArrayPolymorphism=false, classDiscriminator='type', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f14738d + ')';
    }
}
