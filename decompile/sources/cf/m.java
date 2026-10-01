package cf;

import a2.a2;
import a2.w;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import com.playfy.tv.databinding.MessageLyBinding;
import fd.h0;
import gd.v;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.z;
import l4.x;
import o5.e0;
import okhttp3.HttpUrl;
import t0.f0;
import t0.q0;
import t0.x1;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m {
    public static le.h A(le.f fVar, le.h context) {
        kotlin.jvm.internal.k.e(context, "context");
        if (context == le.i.f8353x) {
            return fVar;
        }
        return (le.h) context.fold(fVar, new h0(9));
    }

    public static long B(long j, long j10) {
        boolean z10;
        boolean z11;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j10;
        }
        long j11 = ((j ^ j10) >>> 63) + Long.MAX_VALUE;
        boolean z12 = false;
        if (numberOfLeadingZeros < 64) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j10 == Long.MIN_VALUE) {
            z12 = true;
        }
        if (!(z10 | (z12 & z11))) {
            long j12 = j * j10;
            if (j == 0 || j12 / j == j10) {
                return j12;
            }
        }
        return j11;
    }

    public static final void C(Context context, final TextInputEditText textInputEditText, final TextInputLayout textInputLayout) {
        Drawable drawable;
        final Drawable drawable2 = context.getDrawable(R.drawable.ic_clear);
        final Drawable endIconDrawable = textInputLayout.getEndIconDrawable();
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        final ClipboardManager clipboardManager = (ClipboardManager) systemService;
        Editable text = textInputEditText.getText();
        if (text != null && text.length() != 0) {
            drawable = drawable2;
        } else {
            drawable = endIconDrawable;
        }
        textInputLayout.setEndIconDrawable(drawable);
        textInputEditText.addTextChangedListener(new jd.m(textInputLayout, textInputEditText, endIconDrawable, drawable2));
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: jd.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClipData.Item itemAt;
                CharSequence text2;
                String obj;
                Drawable drawable3;
                TextInputEditText textInputEditText2 = TextInputEditText.this;
                Editable text3 = textInputEditText2.getText();
                if (text3 != null && text3.length() != 0) {
                    textInputEditText2.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (text2 = itemAt.getText()) != null && (obj = text2.toString()) != null) {
                        if (obj.length() <= 0) {
                            obj = null;
                        }
                        if (obj != null) {
                            textInputEditText2.setText(obj);
                        }
                    }
                }
                Editable text4 = textInputEditText2.getText();
                if (text4 != null && text4.length() != 0) {
                    drawable3 = drawable2;
                } else {
                    drawable3 = endIconDrawable;
                }
                textInputLayout.setEndIconDrawable(drawable3);
            }
        });
    }

    public static final void D(MessageLyBinding messageLyBinding, SharedPreferences sharedPreferences) {
        TextView textView = messageLyBinding.f3343b;
        textView.setText(sharedPreferences.getString("message", HttpUrl.FRAGMENT_ENCODE_SET));
        textView.setSelected(true);
        messageLyBinding.f3342a.setOnClickListener(new fd.b(11, messageLyBinding, sharedPreferences));
    }

    public static final void E(Toolbar toolbar, x navController, k7.c cVar) {
        kotlin.jvm.internal.k.e(toolbar, "<this>");
        kotlin.jvm.internal.k.e(navController, "navController");
        navController.a(new p4.a(toolbar, cVar));
        toolbar.setNavigationOnClickListener(new fd.b(16, navController, cVar));
    }

    public static final void F(Context context, Parcelable parcelable, ve.l onFav) {
        he.i iVar;
        String str;
        String str2;
        kotlin.jvm.internal.k.e(onFav, "onFav");
        if (parcelable instanceof kd.h0) {
            kd.h0 h0Var = (kd.h0) parcelable;
            iVar = new he.i(Boolean.valueOf(h0Var.I), h0Var.f7857x);
        } else if (parcelable instanceof kd.l) {
            kd.l lVar = (kd.l) parcelable;
            iVar = new he.i(Boolean.valueOf(lVar.B), lVar.f7877y);
        } else {
            return;
        }
        boolean booleanValue = ((Boolean) iVar.f6076x).booleanValue();
        String str3 = (String) iVar.f6077y;
        if (booleanValue) {
            str = "Remove";
        } else {
            str = "Add";
        }
        ga.b bVar = new ga.b(context, 0);
        bVar.c(str.concat(" Favourite"));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.k.d(lowerCase, "toLowerCase(...)");
        if (booleanValue) {
            str2 = "from";
        } else {
            str2 = "to";
        }
        bVar.f6209a.f6163f = context.getString(R.string.sure_message, lowerCase + " " + str3 + " " + str2 + " favourites");
        bVar.b(R.string.yes, new gd.u(1, onFav, parcelable));
        bVar.a(R.string.no, new v(1));
        G(bVar);
    }

    public static final void G(ga.b bVar) {
        i.h create = bVar.create();
        create.show();
        i.f fVar = create.C;
        fVar.f6188m.setTextColor(-1);
        fVar.f6191p.setTextColor(-1);
    }

    public static final void H(mc.d dVar) {
        kotlin.jvm.internal.k.e(dVar, "<this>");
        String d10 = dVar.d("baseUrl");
        if (df.u.H(d10, "http", false)) {
            Context context = p7.a.f10615a;
            if (!df.u.z(d10, "/", false)) {
                d10 = d10.concat("/");
            }
            kotlin.jvm.internal.k.e(d10, "<set-?>");
            p7.a.f10616b = d10;
        }
    }

    public static final String I(String str) {
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            kotlin.jvm.internal.k.b(decode);
            return decode;
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static final void J(v6.i iVar) {
        Integer valueOf = Integer.valueOf(R.mipmap.ic_launcher_round);
        iVar.f13376p = valueOf;
        iVar.f13377q = valueOf;
    }

    public static final void a(ConstraintLayout constraintLayout) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        kotlin.jvm.internal.k.e(constraintLayout, "<this>");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i6 = marginLayoutParams.bottomMargin;
        } else {
            i6 = 0;
        }
        w wVar = new w(i6, 3, constraintLayout);
        WeakHashMap weakHashMap = q0.f12397a;
        t0.h0.l(constraintLayout, wVar);
        f0.c(constraintLayout);
    }

    public static final boolean b(final Activity activity) {
        boolean z10;
        PackageManager.ApplicationInfoFlags of2;
        ApplicationInfo applicationInfo;
        for (Map.Entry entry : ie.w.y(new he.i("UmVxYWJsZQ==", "Y29tLnJlcWFibGUuYW5kcm9pZA=="), new he.i("SHR0cCBDYW5hcnk=", "Y29tLmd1b3NoaS5odHRwY2FuYXJ5"), new he.i("SHR0cCBDYW5hcnkgUHJlbWl1bQ==", "Y29tLmd1b3NoaS5odHRwY2FuYXJ5LnByZW1pdW0="), new he.i("UGFja2V0IENhcHR1cmU=", "YXBwLmdyZXlzaGlydHMuc3NsY2FwdHVyZQ=="), new he.i("TmV0IENhcHR1cmU=", "Y29tLm1pbmh1aS5uZXR3b3JrY2FwdHVyZQ=="), new he.i("U25pZmVyIFdpY2Vw", "Y29tLmV2YmFkcm9pZC53aWNhcGRlbW8="), new he.i("UGFja2V0IFNuaWZlcg==", "Y29tLnBhY2thZ2VzbmlmZmVyLmZydHBhcmxhaw=="), new he.i("U25pZmVyIFByb3h5bW9u", "Y29tLmV2YmFkcm9pZC5wcm94eW1vbg=="), new he.i("TmV0d29yayBDYXB0dXJl", "Y29tLm1pbmh1aS53aWZpYW5hbHl6ZXI="), new he.i("TmV0IEtlZXBlcg==", "Y29tLm1pbmh1aS5uZXR3b3JrY2FwdHVyZS5wcm8="), new he.i("dFBhY2tldENhcHR1cmU=", "anAuY28udGFvc29mdHdhcmUuYW5kcm9pZC5wYWNrZXRjYXB0dXJl"), new he.i("TVNuaWZmZXI=", "Y29tLmFuZHJpZWxsLm11bHRpY2FzdF9zbmlmZmVy"), new he.i("UENBUFpkcm9pZA==", "Y29tLmVtYW51ZWxlZi5yZW1vdGVfY2FwdHVyZQ==")).entrySet()) {
            PackageManager packageManager = activity.getPackageManager();
            kotlin.jvm.internal.k.d(packageManager, "getPackageManager(...)");
            String q9 = q((String) entry.getValue());
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of2 = PackageManager.ApplicationInfoFlags.of(0L);
                    applicationInfo = packageManager.getApplicationInfo(q9, of2);
                    z10 = applicationInfo.enabled;
                } else {
                    z10 = packageManager.getApplicationInfo(q9, 0).enabled;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                String q10 = q((String) entry.getKey());
                ga.b bVar = new ga.b(activity, 0);
                bVar.c("Detected ".concat(q10));
                i.d dVar = bVar.f6209a;
                dVar.f6163f = "Our app has detected that you are using ( " + q10 + " ) app in your device. if you want to continue to our app then uninstall it.";
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: jd.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialog, int i6) {
                        kotlin.jvm.internal.k.e(dialog, "dialog");
                        dialog.dismiss();
                        activity.finishAffinity();
                    }
                };
                dVar.f6164g = "Exit";
                dVar.f6165h = onClickListener;
                dVar.f6167k = false;
                dVar.f6168l = new DialogInterface.OnKeyListener() { // from class: jd.l
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
                        if (i6 == 4) {
                            activity.finishAffinity();
                            return true;
                        }
                        return false;
                    }
                };
                G(bVar);
                return false;
            }
        }
        return true;
    }

    public static long c(long j, long j10) {
        boolean z10;
        long j11 = j + j10;
        boolean z11 = false;
        if ((j ^ j10) < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((j ^ j11) >= 0) {
            z11 = true;
        }
        if (z10 | z11) {
            return j11;
        }
        StringBuilder sb2 = new StringBuilder("overflow: checkedAdd(");
        sb2.append(j);
        sb2.append(", ");
        throw new ArithmeticException(r4.a.m(sb2, j10, ")"));
    }

    public static final Chip d(Context context, String label, int i6, boolean z10, Integer num, ve.l lVar) {
        kotlin.jvm.internal.k.e(label, "label");
        Chip chip = new Chip(context, null);
        chip.setText(label);
        chip.setTextColor(-1);
        chip.setChipStrokeColor(i0.f.d(chip.getContext(), R.color.item_stroke));
        chip.setChipBackgroundColorResource(R.color.card_back);
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        kotlin.jvm.internal.k.d(valueOf, "valueOf(...)");
        chip.setChipIconTint(valueOf);
        chip.setCheckedIconTint(valueOf);
        chip.setChipStrokeWidth(chip.getResources().getDimension(R.dimen.stroke_width));
        if (num != null) {
            chip.setChipIconResource(num.intValue());
            chip.setChipIconVisible(!z10);
        }
        chip.setCheckedIconResource(R.drawable.ic_check_circle);
        chip.setCheckable(true);
        chip.setChecked(z10);
        chip.setId(i6);
        chip.setOnClickListener(new jd.i(i6, 0, lVar));
        return chip;
    }

    public static final i.h e(Context context, ViewGroup root) {
        ViewGroup viewGroup;
        kotlin.jvm.internal.k.e(root, "root");
        ViewParent parent = root.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(root);
        }
        i.h create = new ga.b(context, 0).create();
        i.f fVar = create.C;
        create.requestWindowFeature(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen._5sdp);
        Object systemService = context.getSystemService("uimode");
        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            fVar.f6183g = root;
            fVar.f6187l = true;
            fVar.f6184h = 0;
            fVar.f6185i = dimensionPixelSize;
            fVar.j = 0;
            fVar.f6186k = dimensionPixelSize;
        } else {
            fVar.f6183g = root;
            fVar.f6187l = true;
            fVar.f6184h = dimensionPixelSize;
            fVar.f6185i = dimensionPixelSize;
            fVar.j = dimensionPixelSize;
            fVar.f6186k = dimensionPixelSize;
        }
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(0);
            if (Build.VERSION.SDK_INT >= 31) {
                window.addFlags(4);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.setBlurBehindRadius(24);
                attributes.dimAmount = 0.35f;
                window.setAttributes(attributes);
                return create;
            }
            window.addFlags(2);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.dimAmount = 0.55f;
            window.setAttributes(attributes2);
        }
        return create;
    }

    public static final boolean f(String current, String str) {
        kotlin.jvm.internal.k.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i6 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i6 < current.length()) {
                    char charAt = current.charAt(i6);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i10++;
                    }
                    i6++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.k.d(substring, "substring(...)");
                    return kotlin.jvm.internal.k.a(df.m.n0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static void g(i4.j jVar) {
        try {
            i4.i iVar = (i4.i) jVar;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                iVar.f6397e.transact(3006, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long h(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r9 = (int) r8
            r8 = r9 | 1
            int[] r9 = fb.e.f5157a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "mode was UNNECESSARY, but rounding was necessary"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.m.h(long, long, java.math.RoundingMode):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (df.m.I(r3, r8, false) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        if (df.m.I(r3, r8, false) == true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList i(java.lang.String r8, java.util.List r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.k.e(r9, r0)
            java.lang.String r0 = "query"
            kotlin.jvm.internal.k.e(r8, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.k.d(r8, r0)
            java.lang.CharSequence r8 = df.m.n0(r8)
            java.lang.String r8 = r8.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L26:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r9.next()
            boolean r3 = r2 instanceof kd.i
            r4 = 0
            if (r3 == 0) goto L48
            r3 = r2
            kd.i r3 = (kd.i) r3
            java.lang.String r3 = r3.f7861b
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            kotlin.jvm.internal.k.d(r3, r0)
            boolean r4 = df.m.I(r3, r8, r4)
            goto Lb5
        L48:
            boolean r3 = r2 instanceof kd.l
            if (r3 == 0) goto L5f
            r3 = r2
            kd.l r3 = (kd.l) r3
            java.lang.String r3 = r3.f7877y
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            kotlin.jvm.internal.k.d(r3, r0)
            boolean r4 = df.m.I(r3, r8, r4)
            goto Lb5
        L5f:
            boolean r3 = r2 instanceof kd.u
            r5 = 1
            if (r3 == 0) goto L9a
            r3 = r2
            kd.u r3 = (kd.u) r3
            kd.a0 r6 = r3.C
            java.lang.String r3 = r3.f7901y
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r7)
            kotlin.jvm.internal.k.d(r3, r0)
            boolean r3 = df.m.I(r3, r8, r4)
            if (r3 != 0) goto L98
            java.lang.String r3 = r6.f7836y
            java.lang.String r3 = r3.toLowerCase(r7)
            kotlin.jvm.internal.k.d(r3, r0)
            boolean r3 = df.m.I(r3, r8, r4)
            if (r3 != 0) goto L98
            java.lang.String r3 = r6.f7837z
            java.lang.String r3 = r3.toLowerCase(r7)
            kotlin.jvm.internal.k.d(r3, r0)
            boolean r3 = df.m.I(r3, r8, r4)
            if (r3 == 0) goto Lb5
        L98:
            r4 = 1
            goto Lb5
        L9a:
            boolean r3 = r2 instanceof kd.h0
            if (r3 == 0) goto Lb5
            r3 = r2
            kd.h0 r3 = (kd.h0) r3
            java.lang.String r3 = r3.f7857x
            if (r3 == 0) goto Lb5
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r6)
            kotlin.jvm.internal.k.d(r3, r0)
            boolean r3 = df.m.I(r3, r8, r4)
            if (r3 != r5) goto Lb5
            goto L98
        Lb5:
            if (r4 == 0) goto L26
            r1.add(r2)
            goto L26
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.m.i(java.lang.String, java.util.List):java.util.ArrayList");
    }

    public static final void j(sf.d dVar, vf.a aVar, String str) {
        kotlin.jvm.internal.k.e(dVar, "<this>");
        e0 o10 = aVar.o();
        kotlin.jvm.internal.e eVar = dVar.f12310a;
        o10.getClass();
        z.d(1, null);
        u0.i(str, eVar);
        throw null;
    }

    public static final void k(sf.d dVar, yf.t tVar, Object value) {
        kotlin.jvm.internal.k.e(dVar, "<this>");
        kotlin.jvm.internal.k.e(value, "value");
        e0 e0Var = tVar.f15098e;
        kotlin.jvm.internal.e eVar = dVar.f12310a;
        e0Var.getClass();
        if (eVar.d(value)) {
            z.d(1, null);
        }
        kotlin.jvm.internal.e a10 = kotlin.jvm.internal.x.a(value.getClass());
        String c10 = a10.c();
        if (c10 == null) {
            c10 = String.valueOf(a10);
        }
        u0.i(c10, eVar);
        throw null;
    }

    public static Object l(le.f fVar, Object obj, ve.p operation) {
        kotlin.jvm.internal.k.e(operation, "operation");
        return operation.invoke(obj, fVar);
    }

    public static final String m(Collection collection) {
        kotlin.jvm.internal.k.e(collection, "collection");
        if (!collection.isEmpty()) {
            return df.n.r(ie.j.L(collection, ",\n", "\n", "\n", null, 56)) + "},";
        }
        return " }";
    }

    public static long n(long j, long j10) {
        s1.c.d("a", j);
        s1.c.d("b", j10);
        if (j == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j11 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static le.f o(le.f fVar, le.g key) {
        kotlin.jvm.internal.k.e(key, "key");
        if (kotlin.jvm.internal.k.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static final String p(Context context) {
        String str;
        kotlin.jvm.internal.k.e(context, "<this>");
        String string = context.getResources().getString(R.string.app_name);
        kotlin.jvm.internal.k.d(string, "getString(...)");
        String F = df.u.F(string, " ", "_");
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            kotlin.jvm.internal.k.b(str);
        } catch (Exception unused) {
            str = "unknown";
        }
        return F + "_" + str + ".apk";
    }

    public static final String q(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        try {
            byte[] decode = Base64.decode(str, 0);
            kotlin.jvm.internal.k.d(decode, "decode(...)");
            return new String(decode, df.a.f4115a);
        } catch (Exception unused) {
            return str;
        }
    }

    public static final Class r(bf.d dVar) {
        kotlin.jvm.internal.k.e(dVar, "<this>");
        Class a10 = ((kotlin.jvm.internal.d) dVar).a();
        kotlin.jvm.internal.k.c(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    public static final Class s(bf.d dVar) {
        kotlin.jvm.internal.k.e(dVar, "<this>");
        Class a10 = ((kotlin.jvm.internal.d) dVar).a();
        if (a10.isPrimitive()) {
            String name = a10.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a10;
    }

    public static final List t(List list, Parcelable parcelable) {
        int i6;
        kotlin.jvm.internal.k.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!kotlin.jvm.internal.k.a(obj, parcelable) && !(obj instanceof gd.l)) {
                arrayList.add(obj);
            }
        }
        List b02 = ie.j.b0(arrayList);
        Collections.shuffle(b02);
        if (parcelable instanceof kd.u) {
            i6 = 8;
        } else {
            i6 = 16;
        }
        ArrayList a02 = ie.j.a0(ie.j.U(i6, b02));
        a02.add(0, parcelable);
        return ie.j.Z(a02);
    }

    public static final long u(Context context) {
        long longVersionCode;
        kotlin.jvm.internal.k.e(context, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            return longVersionCode;
        }
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static q5.c v(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(m.class.getClassLoader());
                Parcelable parcelable = bundle2.getParcelable("a");
                if (parcelable instanceof ParcelImpl) {
                    return ((ParcelImpl) parcelable).f1177x;
                }
                throw new IllegalArgumentException("Invalid parcel");
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final void w(Window window, boolean z10, View view) {
        a8.d x1Var;
        if (z10) {
            window.addFlags(67108864);
            window.addFlags(134217728);
            window.addFlags(512);
        } else {
            window.clearFlags(67108864);
            window.clearFlags(134217728);
            window.clearFlags(512);
        }
        a2 a2Var = new a2(view);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 35) {
            x1Var = new t0.a2(window, a2Var);
        } else if (i6 >= 30) {
            x1Var = new t0.a2(window, a2Var);
        } else if (i6 >= 26) {
            x1Var = new x1(window, a2Var);
        } else if (i6 >= 23) {
            x1Var = new x1(window, a2Var);
        } else {
            x1Var = new x1(window, a2Var);
        }
        if (z10) {
            x1Var.k();
            x1Var.f();
        } else {
            x1Var.l(519);
        }
    }

    public static le.h x(le.f fVar, le.g key) {
        kotlin.jvm.internal.k.e(key, "key");
        if (kotlin.jvm.internal.k.a(fVar.getKey(), key)) {
            return le.i.f8353x;
        }
        return fVar;
    }

    public static final void y(Context context, String url, boolean z10) {
        kotlin.jvm.internal.k.e(context, "<this>");
        kotlin.jvm.internal.k.e(url, "url");
        try {
            Uri parse = Uri.parse(url);
            if (z10) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setPackage("com.android.chrome");
                    intent.setFlags(268435456);
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", parse);
            intent2.setFlags(268435456);
            if (intent2.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent2);
            } else {
                try {
                    try {
                        context.startActivity(intent2);
                    } catch (Exception unused2) {
                        Toast.makeText(context, "Cannot open link", 0).show();
                    }
                } catch (Exception unused3) {
                    Toast.makeText(context, "No app available to open link", 0).show();
                }
            }
        } catch (Exception unused4) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x003c, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v14, types: [x2.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList z(u1.t r30) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.m.z(u1.t):java.util.ArrayList");
    }
}
