package p4;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import cf.p;
import com.playfy.tv.R;
import he.i;
import ie.s;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.h;
import k7.c;
import kotlin.jvm.internal.k;
import l4.d;
import l4.e;
import l4.g;
import l4.g0;
import l4.l;
import l4.u;
import l4.v;
import l4.x;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10509a;

    /* renamed from: b, reason: collision with root package name */
    public final c f10510b;

    /* renamed from: c, reason: collision with root package name */
    public h f10511c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f10512d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f10513e;

    public a(Toolbar toolbar, c cVar) {
        k.e(toolbar, "toolbar");
        Context context = toolbar.getContext();
        k.d(context, "getContext(...)");
        this.f10509a = context;
        this.f10510b = cVar;
        this.f10513e = new WeakReference(toolbar);
    }

    @Override // l4.l
    public final void a(x xVar, u destination, Bundle bundle) {
        Map map;
        String stringBuffer;
        g0 g0Var;
        String valueOf;
        i iVar;
        Toolbar toolbar;
        k.e(destination, "destination");
        WeakReference weakReference = this.f10513e;
        if (((Toolbar) weakReference.get()) == null) {
            o4.h hVar = xVar.f8199b;
            hVar.getClass();
            hVar.f9912o.remove(this);
            return;
        }
        if (destination instanceof e) {
            return;
        }
        Context context = this.f10509a;
        k.e(context, "context");
        CharSequence charSequence = destination.A;
        if (charSequence == null) {
            stringBuffer = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer2 = new StringBuffer();
            if (bundle != null) {
                map = a8.i.s(bundle);
            } else {
                map = s.f6847x;
            }
            while (matcher.find()) {
                String group = matcher.group(1);
                if (group != null && map.containsKey(group)) {
                    matcher.appendReplacement(stringBuffer2, HttpUrl.FRAGMENT_ENCODE_SET);
                    g gVar = (g) destination.d().get(group);
                    if (gVar != null) {
                        g0Var = gVar.f8120a;
                    } else {
                        g0Var = null;
                    }
                    d dVar = g0.f8125c;
                    if (k.a(g0Var, dVar)) {
                        k.b(bundle);
                        valueOf = context.getString(((Integer) dVar.a(group, bundle)).intValue());
                    } else {
                        k.b(g0Var);
                        k.b(bundle);
                        valueOf = String.valueOf(g0Var.a(group, bundle));
                    }
                    k.b(valueOf);
                    stringBuffer2.append(valueOf);
                } else {
                    throw new IllegalArgumentException(("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
                }
            }
            matcher.appendTail(stringBuffer2);
            stringBuffer = stringBuffer2.toString();
        }
        if (stringBuffer != null && (toolbar = (Toolbar) weakReference.get()) != null) {
            toolbar.setTitle(stringBuffer);
        }
        c cVar = this.f10510b;
        cVar.getClass();
        int i6 = u.C;
        for (u uVar : cf.l.M(new p(18), destination)) {
            if (((HashSet) cVar.f7745y).contains(Integer.valueOf(uVar.f8195y.f9924a))) {
                if (uVar instanceof v) {
                    int i10 = destination.f8195y.f9924a;
                    int i11 = v.E;
                    if (i10 == ((u) cf.l.O(cf.l.M(new p(19), (v) uVar))).f8195y.f9924a) {
                    }
                }
                b(null, 0);
                return;
            }
        }
        h hVar2 = this.f10511c;
        if (hVar2 != null) {
            iVar = new i(hVar2, Boolean.TRUE);
        } else {
            h hVar3 = new h(context);
            this.f10511c = hVar3;
            iVar = new i(hVar3, Boolean.FALSE);
        }
        h hVar4 = (h) iVar.f6076x;
        boolean booleanValue = ((Boolean) iVar.f6077y).booleanValue();
        b(hVar4, R.string.nav_app_bar_navigate_up_description);
        if (booleanValue) {
            float f3 = hVar4.f7536i;
            ObjectAnimator objectAnimator = this.f10512d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hVar4, "progress", f3, 1.0f);
            this.f10512d = ofFloat;
            k.c(ofFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
            ofFloat.start();
            return;
        }
        hVar4.setProgress(1.0f);
    }

    public final void b(h hVar, int i6) {
        boolean z10;
        Toolbar toolbar = (Toolbar) this.f10513e.get();
        if (toolbar != null) {
            if (hVar == null && toolbar.getNavigationIcon() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            toolbar.setNavigationIcon(hVar);
            toolbar.setNavigationContentDescription(i6);
            if (z10) {
                o5.v.a(toolbar, null);
            }
        }
    }
}
