package dc;

import a2.e1;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b7.w;
import com.playfy.tv.databinding.LayoutCustomBottomNavBinding;
import he.m;
import java.io.Serializable;
import java.util.List;
import l4.u;
import ld.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f4066a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4067b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4068c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4069d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f4070e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f4071f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4072g;

    public static void b(a aVar, u uVar) {
        boolean z10;
        int intValue;
        for (k kVar : (List) aVar.f4069d) {
            int i6 = uVar.f8195y.f9924a;
            int i10 = kVar.f8333a;
            ImageView imageView = kVar.f8336d;
            TextView textView = kVar.f8337e;
            if (i6 != i10 && !kVar.f8334b.contains(Integer.valueOf(i6))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                intValue = ((Number) ((m) aVar.f4070e).getValue()).intValue();
            } else {
                intValue = ((Number) ((m) aVar.f4071f).getValue()).intValue();
            }
            ValueAnimator ofArgb = ValueAnimator.ofArgb(textView.getCurrentTextColor(), intValue);
            ofArgb.addUpdateListener(new w(kVar, 4));
            ofArgb.setDuration(400L);
            ofArgb.start();
            if (textView.getPaint().isFakeBoldText() != z10) {
                textView.getPaint().setFakeBoldText(z10);
                textView.invalidate();
            }
            if (z10) {
                LinearLayout linearLayout = kVar.f8335c;
                LayoutCustomBottomNavBinding layoutCustomBottomNavBinding = (LayoutCustomBottomNavBinding) aVar.f4068c;
                View view = layoutCustomBottomNavBinding.f3337k;
                FrameLayout navRootContainer = layoutCustomBottomNavBinding.j;
                kotlin.jvm.internal.k.d(navRootContainer, "navRootContainer");
                linearLayout.post(new e1(aVar, linearLayout, navRootContainer, view));
                imageView.animate().cancel();
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.92f, 1.02f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.92f, 1.02f, 1.0f));
                ofPropertyValuesHolder.setDuration(350L);
                ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                ofPropertyValuesHolder.start();
            }
        }
    }

    public b a() {
        String str;
        if (this.f4066a == 0) {
            str = " registrationStatus";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (((Long) this.f4071f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f4072g) == null) {
            str = w8.k.c(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f4067b, this.f4066a, (String) this.f4068c, (String) this.f4069d, ((Long) this.f4071f).longValue(), ((Long) this.f4072g).longValue(), (String) this.f4070e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
