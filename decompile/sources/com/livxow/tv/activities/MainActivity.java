package com.livxow.tv.activities;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.emoji2.text.v;
import androidx.fragment.app.e;
import androidx.fragment.app.i0;
import androidx.fragment.app.m0;
import androidx.fragment.app.y;
import androidx.media3.decoder.DecoderInputBuffer;
import com.bumptech.glide.f;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.material.appbar.MaterialToolbar;
import com.livxow.tv.activities.MainActivity;
import com.livxow.tv.app.App;
import e.g;
import fc.l;
import fc.m;
import fc.n;
import fc.p;
import h.d0;
import h.j;
import h.k0;
import h.p0;
import h.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import ka.c;
import mc.a;
import nc.d;
import o.o3;
import org.json.JSONException;
import org.json.JSONObject;
import rc.b;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends j {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f3631i0 = 0;
    public o3 W;
    public String X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f3632a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public SearchView f3634c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public d f3635d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public e f3636e0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f3633b0 = -1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final g f3637f0 = l(new d2.e(16), new m0(2));

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final g f3638g0 = l(new gc.e(this), new m0(3));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final i0 f3639h0 = new i0(this, 1);

    public static void v(MainActivity mainActivity, String str) {
        if (str == null) {
            mainActivity.f3633b0 = 0;
            return;
        }
        mainActivity.f3633b0 = str.isEmpty() ? 0 : 2;
        y yVar = mainActivity.f3635d0.f9107g;
        if (yVar instanceof a) {
            ((a) yVar).U(str);
        }
    }

    @Override // h.j, c.j, h0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewK;
        View viewK2;
        q.k();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(m.activity_main, (ViewGroup) null, false);
        int i = l.blur_bottom;
        FrameLayout frameLayout = (FrameLayout) a.a.k(viewInflate, i);
        if (frameLayout != null && (viewK = a.a.k(viewInflate, (i = l.bottom_nav_bind))) != null) {
            mb mbVarE = mb.e(viewK);
            i = l.bottom_space;
            View viewK3 = a.a.k(viewInflate, i);
            if (viewK3 != null) {
                i = l.main_fragment_container;
                FrameLayout frameLayout2 = (FrameLayout) a.a.k(viewInflate, i);
                if (frameLayout2 != null) {
                    i = l.overlay_layout;
                    if (((FrameLayout) a.a.k(viewInflate, i)) != null) {
                        i = l.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) a.a.k(viewInflate, i);
                        if (materialToolbar != null && (viewK2 = a.a.k(viewInflate, (i = l.top_space))) != null) {
                            this.W = new o3((LinearLayout) viewInflate, frameLayout, mbVarE, viewK3, frameLayout2, materialToolbar, viewK2);
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 35) {
                                viewK2.setVisibility(0);
                                final int i11 = 0;
                                ((View) this.W.B).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: gc.c
                                    @Override // android.view.View.OnApplyWindowInsetsListener
                                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                        switch (i11) {
                                            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                int i12 = MainActivity.f3631i0;
                                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                                layoutParams.height = windowInsets.getInsets(WindowInsets.Type.systemBars()).top;
                                                view.setLayoutParams(layoutParams);
                                                break;
                                            default:
                                                int i13 = MainActivity.f3631i0;
                                                if (windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom <= 0) {
                                                    view.setVisibility(8);
                                                } else {
                                                    view.setVisibility(0);
                                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                                    layoutParams2.height = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
                                                    view.setLayoutParams(layoutParams2);
                                                }
                                                break;
                                        }
                                        return windowInsets;
                                    }
                                });
                                final int i12 = 1;
                                ((View) this.W.f9254w).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: gc.c
                                    @Override // android.view.View.OnApplyWindowInsetsListener
                                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                        switch (i12) {
                                            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                int i122 = MainActivity.f3631i0;
                                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                                layoutParams.height = windowInsets.getInsets(WindowInsets.Type.systemBars()).top;
                                                view.setLayoutParams(layoutParams);
                                                break;
                                            default:
                                                int i13 = MainActivity.f3631i0;
                                                if (windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom <= 0) {
                                                    view.setVisibility(8);
                                                } else {
                                                    view.setVisibility(0);
                                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                                    layoutParams2.height = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
                                                    view.setLayoutParams(layoutParams2);
                                                }
                                                break;
                                        }
                                        return windowInsets;
                                    }
                                });
                            }
                            setContentView((LinearLayout) this.W.f9253v);
                            j().a(this.f3639h0, this);
                            App app = App.P;
                            app.f3686w = this;
                            if (i10 >= 33 && i0.d.a(this, "android.permission.POST_NOTIFICATIONS") != 0 && !shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                                this.f3637f0.a("android.permission.POST_NOTIFICATIONS");
                            }
                            this.X = getString(fc.q.app_name);
                            pc.a aVar = app.f3685v;
                            MaterialToolbar materialToolbar2 = (MaterialToolbar) this.W.A;
                            d0 d0Var = (d0) m();
                            if (d0Var.E instanceof Activity) {
                                d0Var.C();
                                f fVar = d0Var.J;
                                if (fVar instanceof p0) {
                                    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                                }
                                d0Var.K = null;
                                if (fVar != null) {
                                    fVar.D();
                                }
                                d0Var.J = null;
                                Object obj = d0Var.E;
                                k0 k0Var = new k0(materialToolbar2, obj instanceof Activity ? ((Activity) obj).getTitle() : d0Var.L, d0Var.H);
                                d0Var.J = k0Var;
                                d0Var.H.f5996w = k0Var.f5937g;
                                materialToolbar2.setBackInvokedCallbackEnabled(true);
                                d0Var.b();
                            }
                            ((MaterialToolbar) this.W.A).setTitleTextColor(-1);
                            ((FrameLayout) this.W.f9255x).setOnClickListener(new gc.d(0));
                            ((FrameLayout) this.W.f9255x).post(new androidx.fragment.app.d(16, this, app));
                            o3 o3Var = this.W;
                            o3 o3Var2 = new o3(this, (mb) o3Var.f9256y, ((FrameLayout) o3Var.f9257z).getId());
                            o3Var2.b(aVar);
                            o3Var2.a((LinearLayout) ((mb) this.W.f9256y).f2889c, false);
                            this.f3635d0 = (d) o3Var2.f9255x;
                            o3Var2.B = new gc.e(this);
                            try {
                                PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                                if (i10 >= 29) {
                                    this.f3632a0 = (int) packageInfo.getLongVersionCode();
                                } else {
                                    this.f3632a0 = packageInfo.versionCode;
                                }
                            } catch (PackageManager.NameNotFoundException e7) {
                                e7.printStackTrace();
                            }
                            int i13 = getApplicationInfo().targetSdkVersion;
                            int i14 = Build.VERSION.SDK_INT >= 24 ? getApplicationInfo().minSdkVersion : 23;
                            int i15 = this.f3632a0;
                            if (!vc.a.j(this).getBoolean("is_tv", false)) {
                                if (i15 > 4 || i15 < 4) {
                                    throw new RuntimeException("");
                                }
                                if (i13 != 36 || i14 != 23) {
                                    throw new RuntimeException("");
                                }
                                String absolutePath = getFilesDir().getAbsolutePath();
                                int i16 = 0;
                                for (int i17 = 0; i17 < absolutePath.length() && i16 <= 2; i17++) {
                                    if (absolutePath.charAt(i17) == '.') {
                                        i16++;
                                    }
                                }
                                if (i16 > 2) {
                                    vc.a.y();
                                    throw null;
                                }
                                int[] iArr = {p.live, p.load};
                                for (int i18 = 0; i18 < 2; i18++) {
                                    InputStream inputStreamOpenRawResource = getResources().openRawResource(iArr[i18]);
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
                                    StringBuilder sb2 = new StringBuilder();
                                    while (true) {
                                        try {
                                            try {
                                                String line = bufferedReader.readLine();
                                                if (line != null) {
                                                    sb2.append(line);
                                                } else {
                                                    try {
                                                        break;
                                                    } catch (IOException e10) {
                                                        e10.printStackTrace();
                                                    }
                                                }
                                            } catch (IOException e11) {
                                                e11.printStackTrace();
                                                inputStreamOpenRawResource.close();
                                            }
                                        } finally {
                                        }
                                    }
                                    inputStreamOpenRawResource.close();
                                    bufferedReader.close();
                                    try {
                                        new JSONObject(sb2.toString());
                                    } catch (JSONException unused) {
                                        vc.a.y();
                                        throw null;
                                    }
                                }
                                try {
                                    Field[] declaredFields = p.class.getDeclaredFields();
                                    if (declaredFields.length != 2) {
                                        vc.a.y();
                                        throw null;
                                    }
                                    try {
                                        if (getResources().getResourceName(declaredFields[1].getInt(p.class) + 1) != null) {
                                            vc.a.y();
                                            throw null;
                                        }
                                    } catch (Resources.NotFoundException unused2) {
                                    }
                                } catch (IllegalAccessException unused3) {
                                    vc.a.y();
                                    throw null;
                                }
                            }
                            if (!b.f11362a || !b.f11363b) {
                                vc.a.y();
                                throw null;
                            }
                            app.f3689z = new gc.e(this);
                            File externalFilesDir = getExternalFilesDir(null);
                            if (externalFilesDir == null) {
                                return;
                            }
                            c.G(externalFilesDir);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(n.menu_buttons, menu);
        final int i = 0;
        menu.findItem(l.fav_menu).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) { // from class: gc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f5805b;

            {
                this.f5805b = this;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f5805b.f3635d0.c();
                        break;
                    default:
                        y yVar = this.f5805b.f3635d0.f9107g;
                        if (yVar instanceof mc.a) {
                            ((mc.a) yVar).T();
                        }
                        break;
                }
                return true;
            }
        });
        final int i10 = 1;
        menu.findItem(l.refresh).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) { // from class: gc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f5805b;

            {
                this.f5805b = this;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        this.f5805b.f3635d0.c();
                        break;
                    default:
                        y yVar = this.f5805b.f3635d0.f9107g;
                        if (yVar instanceof mc.a) {
                            ((mc.a) yVar).T();
                        }
                        break;
                }
                return true;
            }
        });
        MenuItem menuItemFindItem = menu.findItem(l.search);
        menuItemFindItem.setOnActionExpandListener(new gc.g(this));
        SearchView searchView = (SearchView) menuItemFindItem.getActionView();
        this.f3634c0 = searchView;
        if (searchView == null) {
            return true;
        }
        searchView.setBackgroundColor(0);
        View viewFindViewById = this.f3634c0.findViewById(g.f.search_plate);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(0);
        }
        View viewFindViewById2 = this.f3634c0.findViewById(g.f.submit_area);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setBackgroundColor(0);
        }
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) this.f3634c0.findViewById(g.f.search_src_text);
        searchAutoComplete.setHintTextColor(getColor(fc.j.gray_77));
        searchAutoComplete.setTextColor(-1);
        this.f3634c0.setQueryHint("Search..");
        this.f3634c0.setOnQueryTextListener(new s5.c(17, this));
        return super.onCreateOptionsMenu(menu);
    }

    public final void w() {
        if (this.f3633b0 != -1) {
            this.f3633b0 = 0;
        }
        if (this.Z) {
            finish();
        } else if (this.f3635d0.a()) {
            Toast.makeText(this, "Tap again to exit", 0).show();
            this.Z = true;
            new Handler(Looper.getMainLooper()).postDelayed(new v(17, this), 2000L);
        }
    }
}
