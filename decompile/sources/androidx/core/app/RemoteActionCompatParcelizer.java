package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import q5.a;
import q5.b;
import q5.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f849a;
        boolean z10 = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f849a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f850b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f11092e);
        }
        remoteActionCompat.f850b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f851c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f11092e);
        }
        remoteActionCompat.f851c = charSequence2;
        remoteActionCompat.f852d = (PendingIntent) aVar.g(remoteActionCompat.f852d, 4);
        boolean z11 = remoteActionCompat.f853e;
        if (aVar.e(5)) {
            if (((b) aVar).f11092e.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        remoteActionCompat.f853e = z11;
        boolean z12 = remoteActionCompat.f854f;
        if (!aVar.e(6)) {
            z10 = z12;
        } else if (((b) aVar).f11092e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f854f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f849a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f850b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f11092e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f851c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f852d, 4);
        boolean z10 = remoteActionCompat.f853e;
        aVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f854f;
        aVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
