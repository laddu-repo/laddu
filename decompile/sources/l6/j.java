package l6;

import android.util.Log;
import b1.v;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.DownloadFileException;
import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NoCacheException;
import com.drake.net.exception.RequestParamsException;
import com.drake.net.exception.ResponseException;
import com.drake.net.exception.ServerResponseException;
import com.drake.net.exception.URLParseException;
import com.playfy.tv.R;
import gf.a0;
import gf.z;
import java.net.UnknownHostException;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends le.a implements a0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8243x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8244y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(z.f5729x);
        this.f8244y = kVar;
    }

    @Override // gf.a0
    public final void handleException(le.h hVar, Throwable e10) {
        boolean z10;
        boolean z11;
        String string;
        int i6 = this.f8243x;
        Object obj = this.f8244y;
        switch (i6) {
            case 0:
                ((k) obj).getClass();
                return;
            default:
                z7.b bVar = (z7.b) obj;
                kotlin.jvm.internal.k.e(e10, "e");
                p pVar = bVar.f15225x;
                if (pVar != null) {
                    pVar.invoke(bVar, e10);
                    return;
                }
                if (bVar.A != null) {
                    z10 = bVar.C;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = bVar.D;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    p7.a.f10623i.getClass();
                    int i10 = 1;
                    if (e10 instanceof UnknownHostException) {
                        string = p7.a.a().getString(R.string.net_host_error);
                    } else if (e10 instanceof URLParseException) {
                        string = p7.a.a().getString(R.string.net_url_error);
                    } else if (e10 instanceof NetConnectException) {
                        string = p7.a.a().getString(R.string.net_connect_error);
                    } else if (e10 instanceof NetSocketTimeoutException) {
                        string = p7.a.a().getString(R.string.net_connect_timeout_error, e10.getMessage());
                    } else if (e10 instanceof DownloadFileException) {
                        string = p7.a.a().getString(R.string.net_download_error);
                    } else if (e10 instanceof ConvertException) {
                        string = p7.a.a().getString(R.string.net_parse_error);
                    } else if (e10 instanceof RequestParamsException) {
                        string = p7.a.a().getString(R.string.net_request_error);
                    } else if (e10 instanceof ServerResponseException) {
                        string = p7.a.a().getString(R.string.net_server_error);
                    } else if (e10 instanceof NullPointerException) {
                        string = p7.a.a().getString(R.string.net_null_error);
                    } else if (e10 instanceof NoCacheException) {
                        string = p7.a.a().getString(R.string.net_no_cache_error);
                    } else if (e10 instanceof ResponseException) {
                        string = e10.getMessage();
                    } else if (e10 instanceof HttpFailureException) {
                        string = p7.a.a().getString(R.string.request_failure);
                    } else if (e10 instanceof NetException) {
                        string = p7.a.a().getString(R.string.net_error);
                    } else {
                        string = p7.a.a().getString(R.string.net_other_error);
                    }
                    if (p7.a.f10619e) {
                        Log.d(p7.a.f10620f, he.a.e(e10));
                    }
                    if (string != null) {
                        b8.b.a(new v(string, i10));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z7.b bVar) {
        super(z.f5729x);
        this.f8244y = bVar;
    }
}
