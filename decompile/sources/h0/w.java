package h0;

import android.app.Notification;
import android.os.Parcel;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f5805a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification f5806b;

    public w(String str, Notification notification) {
        this.f5805a = str;
        this.f5806b = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f5805a;
        Notification notification = this.f5806b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1215a);
            obtain.writeString(str);
            obtain.writeInt(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
            obtain.writeString(null);
            obtain.writeInt(1);
            notification.writeToParcel(obtain, 0);
            aVar.f1213e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return r4.a.o(new StringBuilder("NotifyTask[packageName:"), this.f5805a, ", id:1001, tag:null]");
    }
}
