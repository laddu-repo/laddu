package q0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f10806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10808e;

    public /* synthetic */ e(String str, Context context, Object obj, int i6, int i10) {
        this.f10804a = i10;
        this.f10805b = str;
        this.f10806c = context;
        this.f10808e = obj;
        this.f10807d = i6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f10804a;
        int i10 = this.f10807d;
        Object obj = this.f10808e;
        Context context = this.f10806c;
        String str = this.f10805b;
        switch (i6) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, Collections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return h.b(str, context, (ArrayList) obj, i10);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
