package lg;

import b4.h;
import df.m;
import ie.j;
import java.util.ArrayList;
import kotlin.jvm.internal.k;
import ua.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final jg.a f8401a;

    public b(jg.a aVar) {
        this.f8401a = aVar;
    }

    public Object a(h hVar) {
        f fVar = (f) hVar.f1471z;
        StringBuilder sb2 = new StringBuilder("| (+) '");
        jg.a aVar = this.f8401a;
        sb2.append(aVar);
        sb2.append('\'');
        fVar.r(sb2.toString());
        try {
            pg.a aVar2 = (pg.a) hVar.f1469x;
            if (aVar2 == null) {
                aVar2 = new pg.a(3, null);
            }
            return aVar.f7485c.invoke((tg.a) hVar.A, aVar2);
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e10);
            sb3.append("\n\t");
            StackTraceElement[] stackTrace = e10.getStackTrace();
            k.d(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                k.d(className, "getClassName(...)");
                if (m.I(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb3.append(j.L(arrayList, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + aVar + "': " + sb3.toString();
            k.e(msg, "msg");
            fVar.t(mg.a.A, msg);
            String msg2 = "Could not create instance for '" + aVar + '\'';
            k.e(msg2, "msg");
            throw new Exception(msg2, e10);
        }
    }

    public abstract Object b(h hVar);
}
