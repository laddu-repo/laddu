package q0;

import android.net.Uri;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10819c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10820d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10821e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10822f;

    public i(Uri uri, int i6, int i10, boolean z10, int i11) {
        uri.getClass();
        this.f10817a = uri;
        this.f10818b = i6;
        this.f10819c = i10;
        this.f10820d = z10;
        this.f10821e = null;
        this.f10822f = i11;
    }

    public i(String str, String str2) {
        this.f10817a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f10818b = 0;
        this.f10819c = CommonGatewayClient.CODE_400;
        this.f10820d = false;
        this.f10821e = str2;
        this.f10822f = 0;
    }
}
