package p9;

import android.view.View;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jd.j;
import t9.x;
import x9.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10441e;

    public d(pa.a aVar, boolean z2, x9.b bVar, int i) {
        this.f10437a = 2;
        this.f10441e = aVar;
        this.f10439c = z2;
        this.f10440d = bVar;
        this.f10438b = i;
    }

    public static d b(char c10) {
        return new d(new pa.a(19, new x9.c(c10)), false, x9.d.f14290v, Integer.MAX_VALUE);
    }

    public void a(int i) {
        switch (this.f10437a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10441e;
                WeakReference weakReference = sideSheetBehavior.f3500p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f10438b = i;
                    if (!this.f10439c) {
                        ((View) sideSheetBehavior.f3500p.get()).postOnAnimation((j) this.f10440d);
                        this.f10439c = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f10441e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f10438b = i;
                    if (!this.f10439c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((x) this.f10440d);
                        this.f10439c = true;
                    }
                    break;
                }
                break;
        }
    }

    public List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itE = ((pa.a) this.f10441e).e(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            l lVar = (l) itE;
            if (!lVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) lVar.next());
        }
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f10437a = 0;
        this.f10441e = sideSheetBehavior;
        this.f10440d = new j(3, this);
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        this.f10437a = 1;
        this.f10441e = bottomSheetBehavior;
        this.f10440d = new x(1, this);
    }
}
