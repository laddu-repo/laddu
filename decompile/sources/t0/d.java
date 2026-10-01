package t0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements c, f {
    public int A;
    public Uri B;
    public Bundle C;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12335x = 0;

    /* renamed from: y, reason: collision with root package name */
    public ClipData f12336y;

    /* renamed from: z, reason: collision with root package name */
    public int f12337z;

    public /* synthetic */ d() {
    }

    @Override // t0.f
    public int A() {
        return this.f12337z;
    }

    @Override // t0.f
    public ClipData a() {
        return this.f12336y;
    }

    @Override // t0.c
    public g build() {
        return new g(new d(this));
    }

    @Override // t0.c
    public void e(Uri uri) {
        this.B = uri;
    }

    @Override // t0.c
    public void j(int i6) {
        this.A = i6;
    }

    @Override // t0.c
    public void setExtras(Bundle bundle) {
        this.C = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f12335x) {
            case 1:
                Uri uri = this.B;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f12336y.getDescription());
                sb2.append(", source=");
                int i6 = this.f12337z;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    if (i6 != 5) {
                                        str = String.valueOf(i6);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb2.append(str);
                sb2.append(", flags=");
                int i10 = this.A;
                if ((i10 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i10);
                }
                sb2.append(valueOf);
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (uri == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str2);
                if (this.C != null) {
                    str3 = ", hasExtras";
                }
                return r4.a.o(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    @Override // t0.f
    public int u() {
        return this.A;
    }

    @Override // t0.f
    public ContentInfo w() {
        return null;
    }

    public d(d dVar) {
        ClipData clipData = dVar.f12336y;
        clipData.getClass();
        this.f12336y = clipData;
        int i6 = dVar.f12337z;
        if (i6 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i6 <= 5) {
            this.f12337z = i6;
            int i10 = dVar.A;
            if ((i10 & 1) == i10) {
                this.A = i10;
                this.B = dVar.B;
                this.C = dVar.C;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
