package u6;

import android.graphics.Bitmap;
import bg.e0;
import bg.f0;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import df.m;
import he.g;
import kotlin.jvm.internal.k;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12929a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12930b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12931c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12932d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12933e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f12934f;

    public b(f0 f0Var) {
        final int i6 = 0;
        ve.a aVar = new ve.a(this) { // from class: u6.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ b f12928y;

            {
                this.f12928y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return CacheControl.Companion.parse(this.f12928y.f12934f);
                    default:
                        String str = this.f12928y.f12934f.get(CommonGatewayClient.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.Companion.parse(str);
                        }
                        return null;
                }
            }
        };
        g gVar = g.f6075z;
        this.f12929a = he.a.c(gVar, aVar);
        final boolean z10 = true ? 1 : 0;
        this.f12930b = he.a.c(gVar, new ve.a(this) { // from class: u6.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ b f12928y;

            {
                this.f12928y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                switch (z10) {
                    case 0:
                        return CacheControl.Companion.parse(this.f12928y.f12934f);
                    default:
                        String str = this.f12928y.f12934f.get(CommonGatewayClient.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.Companion.parse(str);
                        }
                        return null;
                }
            }
        });
        this.f12931c = Long.parseLong(f0Var.x(Long.MAX_VALUE));
        this.f12932d = Long.parseLong(f0Var.x(Long.MAX_VALUE));
        this.f12933e = Integer.parseInt(f0Var.x(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(f0Var.x(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i10 = 0; i10 < parseInt; i10++) {
            String x10 = f0Var.x(Long.MAX_VALUE);
            Bitmap.Config[] configArr = a7.f.f595a;
            int P = m.P(x10, ':', 0, 6);
            if (P != -1) {
                String substring = x10.substring(0, P);
                k.d(substring, "substring(...)");
                String obj = m.n0(substring).toString();
                String substring2 = x10.substring(P + 1);
                k.d(substring2, "substring(...)");
                builder.addUnsafeNonAscii(obj, substring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(x10).toString());
            }
        }
        this.f12934f = builder.build();
    }

    public final void a(e0 e0Var) {
        long j;
        e0Var.Z(this.f12931c);
        e0Var.writeByte(10);
        e0Var.Z(this.f12932d);
        e0Var.writeByte(10);
        if (this.f12933e) {
            j = 1;
        } else {
            j = 0;
        }
        e0Var.Z(j);
        e0Var.writeByte(10);
        Headers headers = this.f12934f;
        e0Var.Z(headers.size());
        e0Var.writeByte(10);
        int size = headers.size();
        for (int i6 = 0; i6 < size; i6++) {
            e0Var.F(headers.name(i6));
            e0Var.F(": ");
            e0Var.F(headers.value(i6));
            e0Var.writeByte(10);
        }
    }

    public b(Response response) {
        final int i6 = 0;
        ve.a aVar = new ve.a(this) { // from class: u6.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ b f12928y;

            {
                this.f12928y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return CacheControl.Companion.parse(this.f12928y.f12934f);
                    default:
                        String str = this.f12928y.f12934f.get(CommonGatewayClient.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.Companion.parse(str);
                        }
                        return null;
                }
            }
        };
        g gVar = g.f6075z;
        this.f12929a = he.a.c(gVar, aVar);
        final int i10 = 1;
        this.f12930b = he.a.c(gVar, new ve.a(this) { // from class: u6.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ b f12928y;

            {
                this.f12928y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CacheControl.Companion.parse(this.f12928y.f12934f);
                    default:
                        String str = this.f12928y.f12934f.get(CommonGatewayClient.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.Companion.parse(str);
                        }
                        return null;
                }
            }
        });
        this.f12931c = response.sentRequestAtMillis();
        this.f12932d = response.receivedResponseAtMillis();
        this.f12933e = response.handshake() != null;
        this.f12934f = response.headers();
    }
}
