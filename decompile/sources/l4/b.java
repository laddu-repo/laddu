package l4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@i0("activity")
/* loaded from: classes.dex */
public class b extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f8109c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f8110d;

    public b(Context context) {
        Object obj;
        this.f8109c = context;
        Iterator it = cf.l.M(new cf.p(13), context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f8110d = (Activity) obj;
    }

    @Override // l4.j0
    public final u a() {
        return new u(this);
    }

    @Override // l4.j0
    public final u c(u uVar, Bundle bundle, z zVar) {
        Intent intent;
        int intExtra;
        g0 g0Var;
        String encode;
        a aVar = (a) uVar;
        o4.j jVar = aVar.f8195y;
        if (aVar.D != null) {
            Intent intent2 = new Intent(aVar.D);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar.E;
                if (str != null && str.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        kotlin.jvm.internal.k.b(group);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, HttpUrl.FRAGMENT_ENCODE_SET);
                            g gVar = (g) aVar.d().get(group);
                            if (gVar != null) {
                                g0Var = gVar.f8120a;
                            } else {
                                g0Var = null;
                            }
                            if (g0Var != null) {
                                encode = g0Var.f(g0Var.a(group, bundle));
                            } else {
                                encode = Uri.encode(String.valueOf(bundle.get(group)));
                            }
                            stringBuffer.append(encode);
                        } else {
                            throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + str).toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Activity activity = this.f8110d;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (zVar != null && zVar.f8209a) {
                intent2.addFlags(536870912);
            }
            int i6 = 0;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", jVar.f9924a);
            Context context = this.f8109c;
            Resources resources = context.getResources();
            if (zVar != null) {
                int i10 = zVar.f8216h;
                int i11 = zVar.f8217i;
                if ((i10 > 0 && kotlin.jvm.internal.k.a(resources.getResourceTypeName(i10), "animator")) || (i11 > 0 && kotlin.jvm.internal.k.a(resources.getResourceTypeName(i11), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + " when launching " + aVar);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                    kotlin.jvm.internal.k.b(intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11));
                }
            }
            context.startActivity(intent2);
            if (zVar != null && activity != null) {
                int i12 = zVar.f8214f;
                int i13 = zVar.f8215g;
                if ((i12 > 0 && kotlin.jvm.internal.k.a(resources.getResourceTypeName(i12), "animator")) || (i13 > 0 && kotlin.jvm.internal.k.a(resources.getResourceTypeName(i13), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + aVar);
                    return null;
                }
                if (i12 >= 0 || i13 >= 0) {
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    if (i13 >= 0) {
                        i6 = i13;
                    }
                    activity.overridePendingTransition(i12, i6);
                }
            }
            return null;
        }
        throw new IllegalStateException(r4.a.l(new StringBuilder("Destination "), jVar.f9924a, " does not have an Intent set.").toString());
    }

    @Override // l4.j0
    public final boolean j() {
        Activity activity = this.f8110d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
