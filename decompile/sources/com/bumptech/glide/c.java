package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.media3.decoder.DecoderInputBuffer;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import g6.d0;
import g6.z;
import gc.r;
import j6.e0;
import j6.p;
import j6.t;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k8.c0;
import k8.k2;
import o9.v;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int A(float f, int i, int i10) {
        return l0.b.b(l0.b.d(i10, Math.round(Color.alpha(i10) * f)), i);
    }

    public static float B(EdgeEffect edgeEffect, float f, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return x0.c.c(edgeEffect, f, f4);
        }
        x0.b.a(edgeEffect, f, f4);
        return f;
    }

    public static OkHttpGlideModule C(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof OkHttpGlideModule) {
                    return (OkHttpGlideModule) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e7) {
                M(cls, e7);
                throw null;
            } catch (InstantiationException e10) {
                M(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                M(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                M(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    public static boolean D(Parcel parcel, int i) {
        R(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder E(Parcel parcel, int i) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iH);
        return strongBinder;
    }

    public static int F(Parcel parcel, int i) {
        R(parcel, i, 4);
        return parcel.readInt();
    }

    public static long G(Parcel parcel, int i) {
        R(parcel, i, 8);
        return parcel.readLong();
    }

    public static int H(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final void I(Object[] objArr, int i, int i10) {
        de.i.e(objArr, "<this>");
        while (i < i10) {
            objArr[i] = null;
            i++;
        }
    }

    public static void J(TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        textInputEditText.addTextChangedListener(new kc.d(textInputLayout));
        textInputEditText.setOnFocusChangeListener(new kc.c(textInputEditText, textInputLayout));
    }

    public static void K(final Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z2, kc.e eVar) {
        h.f fVar = new h.f(context);
        View viewInflate = LayoutInflater.from(context).inflate(fc.m.dialog_add_playlist, (ViewGroup) null, false);
        int i = fc.l.login_ly;
        LinearLayout linearLayout = (LinearLayout) a.a.k(viewInflate, i);
        if (linearLayout != null) {
            i = fc.l.pass_container;
            TextInputLayout textInputLayout = (TextInputLayout) a.a.k(viewInflate, i);
            if (textInputLayout != null) {
                i = fc.l.password_input;
                TextInputEditText textInputEditText = (TextInputEditText) a.a.k(viewInflate, i);
                if (textInputEditText != null) {
                    i = fc.l.path_input;
                    TextInputEditText textInputEditText2 = (TextInputEditText) a.a.k(viewInflate, i);
                    if (textInputEditText2 != null) {
                        i = fc.l.path_input_container;
                        TextInputLayout textInputLayout2 = (TextInputLayout) a.a.k(viewInflate, i);
                        if (textInputLayout2 != null) {
                            i = fc.l.title_container;
                            TextInputLayout textInputLayout3 = (TextInputLayout) a.a.k(viewInflate, i);
                            if (textInputLayout3 != null) {
                                i = fc.l.title_input;
                                TextInputEditText textInputEditText3 = (TextInputEditText) a.a.k(viewInflate, i);
                                if (textInputEditText3 != null) {
                                    i = fc.l.user_container;
                                    TextInputLayout textInputLayout4 = (TextInputLayout) a.a.k(viewInflate, i);
                                    if (textInputLayout4 != null) {
                                        i = fc.l.username_input;
                                        TextInputEditText textInputEditText4 = (TextInputEditText) a.a.k(viewInflate, i);
                                        if (textInputEditText4 != null) {
                                            ScrollView scrollView = (ScrollView) viewInflate;
                                            final ad.c cVar = new ad.c(scrollView, linearLayout, textInputLayout, textInputEditText, textInputEditText2, textInputLayout2, textInputLayout3, textInputEditText3, textInputLayout4, textInputEditText4);
                                            if (str3 != null) {
                                                textInputEditText3.setText(str3);
                                                textInputEditText2.setText(str4);
                                                textInputEditText4.setText(str5);
                                                textInputEditText.setText(str6);
                                            }
                                            if (z2) {
                                                textInputLayout2.setHint("Enter Server:Port");
                                                linearLayout.setVisibility(0);
                                            }
                                            fVar.setView(scrollView);
                                            fVar.setTitle(str);
                                            h.b bVar = fVar.f5918a;
                                            bVar.f5841g = str2;
                                            bVar.f5842h = null;
                                            bVar.i = "Cancel";
                                            bVar.f5843j = null;
                                            h.g gVarA = fVar.a();
                                            gVarA.B.i.setOnClickListener(new hc.a(cVar, gVarA, eVar, 2));
                                            final int i10 = 0;
                                            textInputLayout3.setEndIconOnClickListener(new View.OnClickListener() { // from class: kc.b
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i10) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            ((TextInputEditText) cVar.f482z).setText(vc.a.m(context));
                                                            break;
                                                        case 1:
                                                            ((TextInputEditText) cVar.f481y).setText(vc.a.m(context));
                                                            break;
                                                        case 2:
                                                            ((TextInputEditText) cVar.A).setText(vc.a.m(context));
                                                            break;
                                                        default:
                                                            ((TextInputEditText) cVar.f480x).setText(vc.a.m(context));
                                                            break;
                                                    }
                                                }
                                            });
                                            final int i11 = 1;
                                            textInputLayout2.setEndIconOnClickListener(new View.OnClickListener() { // from class: kc.b
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i11) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            ((TextInputEditText) cVar.f482z).setText(vc.a.m(context));
                                                            break;
                                                        case 1:
                                                            ((TextInputEditText) cVar.f481y).setText(vc.a.m(context));
                                                            break;
                                                        case 2:
                                                            ((TextInputEditText) cVar.A).setText(vc.a.m(context));
                                                            break;
                                                        default:
                                                            ((TextInputEditText) cVar.f480x).setText(vc.a.m(context));
                                                            break;
                                                    }
                                                }
                                            });
                                            final int i12 = 2;
                                            textInputLayout4.setEndIconOnClickListener(new View.OnClickListener() { // from class: kc.b
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i12) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            ((TextInputEditText) cVar.f482z).setText(vc.a.m(context));
                                                            break;
                                                        case 1:
                                                            ((TextInputEditText) cVar.f481y).setText(vc.a.m(context));
                                                            break;
                                                        case 2:
                                                            ((TextInputEditText) cVar.A).setText(vc.a.m(context));
                                                            break;
                                                        default:
                                                            ((TextInputEditText) cVar.f480x).setText(vc.a.m(context));
                                                            break;
                                                    }
                                                }
                                            });
                                            final int i13 = 3;
                                            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: kc.b
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i13) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            ((TextInputEditText) cVar.f482z).setText(vc.a.m(context));
                                                            break;
                                                        case 1:
                                                            ((TextInputEditText) cVar.f481y).setText(vc.a.m(context));
                                                            break;
                                                        case 2:
                                                            ((TextInputEditText) cVar.A).setText(vc.a.m(context));
                                                            break;
                                                        default:
                                                            ((TextInputEditText) cVar.f480x).setText(vc.a.m(context));
                                                            break;
                                                    }
                                                }
                                            });
                                            J(textInputEditText3, textInputLayout3);
                                            J(textInputEditText2, textInputLayout2);
                                            J(textInputEditText4, textInputLayout4);
                                            J(textInputEditText, textInputLayout);
                                            int i14 = 5;
                                            textInputLayout3.setEndIconOnClickListener(new r(i14, textInputLayout3, textInputEditText3));
                                            textInputLayout2.setEndIconOnClickListener(new r(i14, textInputLayout2, textInputEditText2));
                                            textInputLayout4.setEndIconOnClickListener(new r(i14, textInputLayout4, textInputEditText4));
                                            textInputLayout.setEndIconOnClickListener(new r(i14, textInputLayout, textInputEditText));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static void L(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + H(parcel, i));
    }

    public static void M(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static String N(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i10 = b0.f13686a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static void O(String str) {
        Log.v("RootBeer", w() + String.valueOf(str));
    }

    public static int P(Parcel parcel) {
        int i = parcel.readInt();
        int iH = H(parcel, i);
        char c10 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new u7.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i10 = iH + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new u7.b(sb2.toString(), parcel);
    }

    public static void R(Parcel parcel, int i, int i10) {
        int iH = H(parcel, i);
        if (iH == i10) {
            return;
        }
        String hexString = Integer.toHexString(iH);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iH).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(iH);
        throw new u7.b(d0.d.n(sb2, " (0x", hexString, ")"), parcel);
    }

    public static void S(Parcel parcel, int i, int i10) {
        if (i == i10) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(i);
        throw new u7.b(d0.d.n(sb2, " (0x", hexString, ")"), parcel);
    }

    public static final String a(Object[] objArr, int i, int i10, pd.e eVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i + i11];
            if (obj == eVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        de.i.d(string, "toString(...)");
        return string;
    }

    public static k b(b bVar, ArrayList arrayList) {
        a6.k aVar;
        a6.k gVar;
        d6.a aVar2;
        int i;
        p pVar;
        String str;
        ContentResolver contentResolver;
        Class cls;
        d6.a aVar3 = bVar.f2342v;
        d6.f fVar = bVar.f2345y;
        g gVar2 = bVar.f2344x;
        Context applicationContext = gVar2.getApplicationContext();
        a9.g gVar3 = gVar2.f2359h;
        k kVar = new k();
        j6.m mVar = new j6.m();
        md.c cVar = kVar.f2371g;
        synchronized (cVar) {
            cVar.f8645w.add(mVar);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            kVar.i(new t());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = kVar.f();
        n6.a aVar4 = new n6.a(applicationContext, arrayListF, aVar3, fVar);
        e0 e0Var = new e0(aVar3, new oa.b(14));
        p pVar2 = new p(kVar.f(), resources.getDisplayMetrics(), aVar3, fVar);
        if (i10 < 28 || !((Map) gVar3.f273w).containsKey(c.class)) {
            j6.f fVar2 = new j6.f(pVar2, 0);
            aVar = new j6.a(2, pVar2, fVar);
            gVar = fVar2;
        } else {
            j6.g gVar4 = new j6.g(1);
            gVar = new j6.g(0);
            aVar = gVar4;
        }
        if (i10 >= 28) {
            i = i10;
            aVar2 = aVar3;
            pVar = pVar2;
            boolean z2 = false;
            kVar.d("Animation", InputStream.class, Drawable.class, new l6.a(new k2(arrayListF, fVar, z2, 25), 1));
            kVar.d("Animation", ByteBuffer.class, Drawable.class, new l6.a(new k2(arrayListF, fVar, z2, 25), 0));
        } else {
            aVar2 = aVar3;
            i = i10;
            pVar = pVar2;
        }
        l6.c cVar2 = new l6.c(applicationContext);
        j6.b bVar2 = new j6.b(fVar);
        c6.i iVar = new c6.i(5, (byte) 0);
        o6.c cVar3 = new o6.c(1);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        kVar.a(ByteBuffer.class, new g6.c(2));
        kVar.a(InputStream.class, new s5.d(fVar));
        kVar.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        kVar.d("Bitmap", InputStream.class, Bitmap.class, aVar);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = str2;
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            str = str2;
            j6.f fVar3 = new j6.f(pVar, 1);
            cls = ParcelFileDescriptor.class;
            kVar.d("Bitmap", cls, Bitmap.class, fVar3);
        }
        d6.a aVar5 = aVar2;
        kVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new e0(aVar5, new t7.k(13)));
        kVar.d("Bitmap", cls, Bitmap.class, e0Var);
        g6.b0 b0Var = g6.b0.f5651b;
        kVar.c(Bitmap.class, Bitmap.class, b0Var);
        kVar.d("Bitmap", Bitmap.class, Bitmap.class, new j6.b0(0));
        kVar.b(Bitmap.class, bVar2);
        kVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new j6.a(resources, gVar));
        kVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new j6.a(resources, aVar));
        kVar.d("BitmapDrawable", cls, BitmapDrawable.class, new j6.a(resources, e0Var));
        kVar.b(BitmapDrawable.class, new k2(aVar5, bVar2, false, 18));
        kVar.d("Animation", InputStream.class, n6.b.class, new n6.i(arrayListF, aVar4, fVar));
        kVar.d("Animation", ByteBuffer.class, n6.b.class, aVar4);
        kVar.b(n6.b.class, new c0(19));
        kVar.c(y5.d.class, y5.d.class, b0Var);
        kVar.d("Bitmap", y5.d.class, Bitmap.class, new j6.c(aVar5));
        kVar.d("legacy_append", Uri.class, Drawable.class, cVar2);
        kVar.d("legacy_append", Uri.class, Bitmap.class, new j6.a(1, cVar2, aVar5));
        kVar.j(new com.bumptech.glide.load.data.g(2));
        kVar.c(File.class, ByteBuffer.class, new g6.b0(3));
        kVar.c(File.class, InputStream.class, new g6.h(new g6.c(5)));
        kVar.d("legacy_append", File.class, File.class, new j6.b0(2));
        kVar.c(File.class, cls, new g6.h(new g6.c(4)));
        kVar.c(File.class, File.class, b0Var);
        kVar.j(new com.bumptech.glide.load.data.l(fVar));
        if (!"robolectric".equals(str)) {
            kVar.j(new com.bumptech.glide.load.data.g(1));
        }
        g6.f fVar4 = new g6.f(applicationContext, 2);
        g6.f fVar5 = new g6.f(applicationContext, 0);
        g6.f fVar6 = new g6.f(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        kVar.c(cls2, InputStream.class, fVar4);
        kVar.c(Integer.class, InputStream.class, fVar4);
        kVar.c(cls2, AssetFileDescriptor.class, fVar5);
        kVar.c(Integer.class, AssetFileDescriptor.class, fVar5);
        kVar.c(cls2, Drawable.class, fVar6);
        kVar.c(Integer.class, Drawable.class, fVar6);
        kVar.c(Uri.class, InputStream.class, new g6.f(applicationContext, 5));
        kVar.c(Uri.class, AssetFileDescriptor.class, new g6.f(applicationContext, 4));
        z zVar = new z(resources, 2);
        z zVar2 = new z(resources, 0);
        z zVar3 = new z(resources, 1);
        kVar.c(Integer.class, Uri.class, zVar);
        kVar.c(cls2, Uri.class, zVar);
        kVar.c(Integer.class, AssetFileDescriptor.class, zVar2);
        kVar.c(cls2, AssetFileDescriptor.class, zVar2);
        kVar.c(Integer.class, InputStream.class, zVar3);
        kVar.c(cls2, InputStream.class, zVar3);
        kVar.c(String.class, InputStream.class, new z5.b(1));
        kVar.c(Uri.class, InputStream.class, new z5.b(1));
        kVar.c(String.class, InputStream.class, new g6.b0(6));
        kVar.c(String.class, cls, new g6.b0(5));
        kVar.c(String.class, AssetFileDescriptor.class, new g6.b0(4));
        kVar.c(Uri.class, InputStream.class, new g6.a(applicationContext.getAssets(), 1));
        kVar.c(Uri.class, AssetFileDescriptor.class, new g6.a(applicationContext.getAssets(), 0));
        kVar.c(Uri.class, InputStream.class, new g6.f(applicationContext, 6));
        kVar.c(Uri.class, InputStream.class, new g6.f(applicationContext, 7));
        if (i >= 29) {
            kVar.c(Uri.class, InputStream.class, new h6.b(applicationContext, InputStream.class));
            kVar.c(Uri.class, cls, new h6.b(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) gVar3.f273w).containsKey(f.class);
        ContentResolver contentResolver3 = contentResolver;
        kVar.c(Uri.class, InputStream.class, new d0(contentResolver3, zContainsKey, 2));
        kVar.c(Uri.class, cls, new d0(contentResolver3, zContainsKey, 1));
        kVar.c(Uri.class, AssetFileDescriptor.class, new d0(contentResolver3, zContainsKey, 0));
        kVar.c(Uri.class, InputStream.class, new g6.b0(7));
        kVar.c(URL.class, InputStream.class, new h6.e());
        kVar.c(Uri.class, File.class, new g6.f(applicationContext, 3));
        kVar.c(g6.i.class, InputStream.class, new z5.b(2));
        kVar.c(byte[].class, ByteBuffer.class, new g6.b0(1));
        kVar.c(byte[].class, InputStream.class, new g6.b0(2));
        kVar.c(Uri.class, Uri.class, b0Var);
        kVar.c(Drawable.class, Drawable.class, b0Var);
        kVar.d("legacy_append", Drawable.class, Drawable.class, new j6.b0(1));
        kVar.k(Bitmap.class, BitmapDrawable.class, new ka.c(resources));
        kVar.k(Bitmap.class, byte[].class, iVar);
        kVar.k(Drawable.class, byte[].class, new hd.a(aVar5, iVar, cVar3, 20));
        kVar.k(n6.b.class, byte[].class, cVar3);
        e0 e0Var2 = new e0(aVar5, new kb.e(14));
        kVar.d("legacy_append", ByteBuffer.class, Bitmap.class, e0Var2);
        kVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new j6.a(resources, e0Var2));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) obj;
            try {
                okHttpGlideModule.a(kVar);
            } catch (AbstractMethodError e7) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule.getClass().getName()), e7);
            }
        }
        return kVar;
    }

    public static Bundle c(Parcel parcel, int i) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iH);
        return bundle;
    }

    public static byte[] d(Parcel parcel, int i) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iH);
        return bArrCreateByteArray;
    }

    public static byte[][] e(Parcel parcel, int i) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        int i10 = parcel.readInt();
        byte[][] bArr = new byte[i10][];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iH);
        return bArr;
    }

    public static int[] f(Parcel parcel, int i) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iH);
        return iArrCreateIntArray;
    }

    public static Parcelable g(Parcel parcel, int i, Parcelable.Creator creator) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iH);
        return parcelable;
    }

    public static String h(Parcel parcel, int i) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iH);
        return string;
    }

    public static Object[] i(Parcel parcel, int i, Parcelable.Creator creator) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iH);
        return objArrCreateTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i, Parcelable.Creator creator) {
        int iH = H(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iH);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Serializable serializable) {
        Log.e("RootBeer", w() + String.valueOf(serializable));
        Log.e("QLog", w() + String.valueOf(serializable));
    }

    public static void l(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new u7.b(u5.a.b(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0018->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List m(p4.s r9, int r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            de.i.e(r9, r0)
            java.util.LinkedHashMap r9 = r9.f10354a
            if (r10 != r11) goto Lc
            pd.p r9 = pd.p.f10551v
            return r9
        Lc:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto L12
            r2 = r1
            goto L13
        L12:
            r2 = r0
        L13:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L18:
            if (r2 == 0) goto L1d
            if (r10 >= r11) goto L91
            goto L1f
        L1d:
            if (r10 <= r11) goto L91
        L1f:
            r4 = 0
            if (r2 == 0) goto L3a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L30
        L2e:
            r7 = r4
            goto L50
        L30:
            java.util.NavigableSet r6 = r5.descendingKeySet()
            od.f r7 = new od.f
            r7.<init>(r5, r6)
            goto L50
        L3a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L47
            goto L2e
        L47:
            java.util.Set r6 = r5.keySet()
            od.f r7 = new od.f
            r7.<init>(r5, r6)
        L50:
            if (r7 != 0) goto L53
            goto L90
        L53:
            java.lang.Object r5 = r7.f10116v
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r7.f10117w
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L78
            int r8 = r10 + 1
            if (r8 > r7) goto L5f
            if (r7 > r11) goto L5f
            goto L7c
        L78:
            if (r11 > r7) goto L5f
            if (r7 >= r10) goto L5f
        L7c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            de.i.b(r10)
            r3.add(r10)
            r5 = r1
            r10 = r7
            goto L8e
        L8d:
            r5 = r0
        L8e:
            if (r5 != 0) goto L18
        L90:
            return r4
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.m(p4.s, int, int):java.util.List");
    }

    public static int n(Context context, int i, int i10) {
        Integer numValueOf;
        TypedValue typedValueH = b8.h.H(context, i);
        if (typedValueH != null) {
            int i11 = typedValueH.resourceId;
            numValueOf = Integer.valueOf(i11 != 0 ? context.getColor(i11) : typedValueH.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i10;
    }

    public static int o(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueJ = b8.h.J(i, view.getContext(), view.getClass().getCanonicalName());
        int i10 = typedValueJ.resourceId;
        return i10 != 0 ? context.getColor(i10) : typedValueJ.data;
    }

    public static ColorStateList p(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = i0.d.c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public static ColorStateList q(Context context, hd.a aVar, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) aVar.f6280x;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = i0.d.c(context, resourceId)) == null) ? aVar.s(i) : colorStateListC;
    }

    public static float s(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return x0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable t(Context context, int i) {
        return o.k2.d().f(context, i);
    }

    public static Drawable u(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableT;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableT = t(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableT;
    }

    public static SharedPreferences v(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static String w() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static boolean x(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = l0.b.f7993a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) iRed) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static boolean y(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean z(p4.a aVar, int i, int i10) {
        de.i.e(aVar, "<this>");
        if (i > i10 && aVar.f10275l) {
            return false;
        }
        Set set = aVar.f10276m;
        return aVar.f10274k && (set == null || !set.contains(Integer.valueOf(i)));
    }

    public abstract void Q(byte[] bArr, int i, int i10);

    public abstract void r(v vVar, float f, float f4);
}
