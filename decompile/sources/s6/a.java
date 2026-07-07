package s6;

import a7.f;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import df.m;
import ie.j;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12223a;

    public /* synthetic */ a(int i6) {
        this.f12223a = i6;
    }

    public final Object a(Object obj, o oVar) {
        String scheme;
        String authority;
        switch (this.f12223a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!f.d(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (m.c0(path, '/') && ((String) j.H(uri.getPathSegments())) != null) {
                        if (k.a(uri.getScheme(), "file")) {
                            String path2 = uri.getPath();
                            if (path2 != null) {
                                return new File(path2);
                            }
                        } else {
                            return new File(uri.toString());
                        }
                    }
                }
                return null;
            case 2:
                return ((HttpUrl) obj).toString();
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = oVar.f13407a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (k.a(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !m.S(authority) && uri2.getPathSegments().size() == 2) {
                    String authority2 = uri2.getAuthority();
                    if (authority2 == null) {
                        authority2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Resources resourcesForApplication = oVar.f13407a.getPackageManager().getResourcesForApplication(authority2);
                    List<String> pathSegments = uri2.getPathSegments();
                    int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    if (identifier != 0) {
                        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
                    }
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return null;
            default:
                return Uri.parse((String) obj);
        }
    }
}
