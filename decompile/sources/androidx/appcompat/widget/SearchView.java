package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.playfy.tv.R;
import fd.n;
import fd.q;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n9.j;
import nd.f0;
import ne.f;
import okhttp3.HttpUrl;
import p.a3;
import p.l0;
import p.o;
import p.r2;
import p.s2;
import p.t2;
import p.u2;
import p.v2;
import p.w2;
import p.x2;
import p.y1;
import p.y2;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SearchView extends y1 implements n.b {
    public static final f F0;
    public SearchableInfo A0;
    public Bundle B0;
    public final r2 C0;
    public final r2 D0;
    public final WeakHashMap E0;
    public final SearchAutoComplete M;
    public final View N;
    public final View O;
    public final View P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public final ImageView T;
    public final View U;
    public y2 V;
    public final Rect W;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f769a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int[] f770b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f771c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ImageView f772d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Drawable f773e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int f774f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f775g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Intent f776h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Intent f777i0;

    /* renamed from: j0, reason: collision with root package name */
    public final CharSequence f778j0;

    /* renamed from: k0, reason: collision with root package name */
    public v2 f779k0;

    /* renamed from: l0, reason: collision with root package name */
    public View.OnFocusChangeListener f780l0;

    /* renamed from: m0, reason: collision with root package name */
    public View.OnClickListener f781m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f782n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public x0.a f783p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f784q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f785r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f786s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f787t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f788u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f789v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f790w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f791x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f792y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f793z0;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ne.f] */
    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f9730a = null;
            obj.f9731b = null;
            obj.f9732c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f9730a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f9731b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f9732c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = obj;
        }
        F0 = fVar;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.W = new Rect();
        this.f769a0 = new Rect();
        this.f770b0 = new int[2];
        this.f771c0 = new int[2];
        this.C0 = new r2(this, 0);
        this.D0 = new r2(this, 1);
        this.E0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        t2 t2Var = new t2(this);
        l0 l0Var = new l0(this, 1);
        f0 f0Var = new f0(this, 2);
        q qVar = new q(this, 1);
        int[] iArr = h.a.f5751v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        j jVar = new j(context, obtainStyledAttributes);
        q0.q(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.M = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.N = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.O = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.P = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.Q = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.R = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.S = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.T = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f772d0 = imageView5;
        findViewById.setBackground(jVar.v(20));
        findViewById2.setBackground(jVar.v(25));
        imageView.setImageDrawable(jVar.v(23));
        imageView2.setImageDrawable(jVar.v(15));
        imageView3.setImageDrawable(jVar.v(12));
        imageView4.setImageDrawable(jVar.v(28));
        imageView5.setImageDrawable(jVar.v(23));
        this.f773e0 = jVar.v(22);
        e9.f.i(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f774f0 = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f775g0 = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(qVar);
        searchAutoComplete.setOnEditorActionListener(t2Var);
        searchAutoComplete.setOnItemClickListener(l0Var);
        searchAutoComplete.setOnItemSelectedListener(f0Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new s2(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f778j0 = obtainStyledAttributes.getText(14);
        this.f785r0 = obtainStyledAttributes.getText(21);
        int i6 = obtainStyledAttributes.getInt(6, -1);
        if (i6 != -1) {
            setImeOptions(i6);
        }
        int i10 = obtainStyledAttributes.getInt(5, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        jVar.G();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f776h0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f777i0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.U = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new n(this, 1));
        }
        w(this.f782n0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.M;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f787t0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.M;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f787t0 = false;
    }

    public int getImeOptions() {
        return this.M.getImeOptions();
    }

    public int getInputType() {
        return this.M.getInputType();
    }

    public int getMaxWidth() {
        return this.f788u0;
    }

    public CharSequence getQuery() {
        return this.M.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f785r0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.A0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.A0.getHintId());
        }
        return this.f778j0;
    }

    public int getSuggestionCommitIconResId() {
        return this.f775g0;
    }

    public int getSuggestionRowLayout() {
        return this.f774f0;
    }

    public x0.a getSuggestionsAdapter() {
        return this.f783p0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f791x0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.B0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.A0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i6;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.B0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i6 = searchableInfo.getVoiceMaxResults();
        } else {
            i6 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i6);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i6 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.M;
        if (i6 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = F0;
        fVar.getClass();
        f.a();
        Method method = fVar.f9730a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        f.a();
        Method method2 = fVar.f9731b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.M;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f782n0) {
                clearFocus();
                w(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void n(int i6) {
        int i10;
        Uri parse;
        String h4;
        Cursor cursor = this.f783p0.f14456z;
        if (cursor != null && cursor.moveToPosition(i6)) {
            Intent intent = null;
            try {
                int i11 = a3.U;
                String h10 = a3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h10 == null) {
                    h10 = this.A0.getSuggestIntentAction();
                }
                if (h10 == null) {
                    h10 = "android.intent.action.SEARCH";
                }
                String h11 = a3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h11 == null) {
                    h11 = this.A0.getSuggestIntentData();
                }
                if (h11 != null && (h4 = a3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h11 = h11 + "/" + Uri.encode(h4);
                }
                if (h11 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h11);
                }
                intent = j(h10, parse, a3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), a3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i10 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i10 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i10 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.M;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i6) {
        Editable text = this.M.getText();
        Cursor cursor = this.f783p0.f14456z;
        if (cursor != null) {
            if (cursor.moveToPosition(i6)) {
                String c10 = this.f783p0.c(cursor);
                if (c10 != null) {
                    setQuery(c10);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    @Override // n.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.M;
        searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f791x0 = HttpUrl.FRAGMENT_ENCODE_SET;
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f793z0);
        this.f792y0 = false;
    }

    @Override // n.b
    public final void onActionViewExpanded() {
        if (this.f792y0) {
            return;
        }
        this.f792y0 = true;
        SearchAutoComplete searchAutoComplete = this.M;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f793z0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.C0);
        post(this.D0);
        super.onDetachedFromWindow();
    }

    @Override // p.y1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.M;
            int[] iArr = this.f770b0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f771c0;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.W;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.f769a0;
            rect2.set(i15, 0, i16, i17);
            y2 y2Var = this.V;
            if (y2Var == null) {
                y2 y2Var2 = new y2(searchAutoComplete, rect2, rect);
                this.V = y2Var2;
                setTouchDelegate(y2Var2);
            } else {
                y2Var.f10428b.set(rect2);
                Rect rect3 = y2Var.f10430d;
                rect3.set(rect2);
                int i18 = -y2Var.f10431e;
                rect3.inset(i18, i18);
                y2Var.f10429c.set(rect);
            }
        }
    }

    @Override // p.y1, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        if (this.o0) {
            super.onMeasure(i6, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i11 = this.f788u0) > 0) {
                    size = Math.min(i11, size);
                }
            } else {
                size = this.f788u0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i12 = this.f788u0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x2 x2Var = (x2) parcelable;
        super.onRestoreInstanceState(x2Var.f15113x);
        w(x2Var.f10420z);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [z0.b, android.os.Parcelable, p.x2] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new z0.b(super.onSaveInstanceState());
        bVar.f10420z = this.o0;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.C0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.M;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f779k0 != null) {
                text.toString();
                return;
            }
            if (this.A0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        int i6;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.M.getText());
        if (isEmpty && (!this.f782n0 || this.f792y0)) {
            i6 = 8;
        } else {
            i6 = 0;
        }
        ImageView imageView = this.S;
        imageView.setVisibility(i6);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i6, Rect rect) {
        if (this.f787t0 || !isFocusable()) {
            return false;
        }
        if (!this.o0) {
            boolean requestFocus = this.M.requestFocus(i6, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i6, rect);
    }

    public final void s() {
        int[] iArr;
        if (this.M.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.O.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.P.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.B0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.M;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f781m0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f782n0 == z10) {
            return;
        }
        this.f782n0 = z10;
        w(z10);
        t();
    }

    public void setImeOptions(int i6) {
        this.M.setImeOptions(i6);
    }

    public void setInputType(int i6) {
        this.M.setInputType(i6);
    }

    public void setMaxWidth(int i6) {
        this.f788u0 = i6;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f780l0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(v2 v2Var) {
        this.f779k0 = v2Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f781m0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f785r0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i6;
        this.f786s0 = z10;
        x0.a aVar = this.f783p0;
        if (aVar instanceof a3) {
            a3 a3Var = (a3) aVar;
            if (z10) {
                i6 = 2;
            } else {
                i6 = 1;
            }
            a3Var.M = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.A0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.M
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.A0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.A0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.A0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            x0.a r7 = r6.f783p0
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.A0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            p.a3 r7 = new p.a3
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.A0
            java.util.WeakHashMap r5 = r6.E0
            r7.<init>(r3, r6, r4, r5)
            r6.f783p0 = r7
            r2.setAdapter(r7)
            x0.a r7 = r6.f783p0
            p.a3 r7 = (p.a3) r7
            boolean r3 = r6.f786s0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = 1
        L60:
            r7.M = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.A0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.A0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f776h0
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.A0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f777i0
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r6.f789v0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.o0
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f784q0 = z10;
        w(this.o0);
    }

    public void setSuggestionsAdapter(x0.a aVar) {
        this.f783p0 = aVar;
        this.M.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean z10 = this.f782n0;
        SearchAutoComplete searchAutoComplete = this.M;
        if (z10 && (drawable = this.f773e0) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        int i6;
        if ((this.f784q0 || this.f789v0) && !this.o0 && (this.R.getVisibility() == 0 || this.T.getVisibility() == 0)) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        this.P.setVisibility(i6);
    }

    public final void v(boolean z10) {
        int i6;
        boolean z11 = this.f784q0;
        if (z11 && ((z11 || this.f789v0) && !this.o0 && hasFocus() && (z10 || !this.f789v0))) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        this.R.setVisibility(i6);
    }

    public final void w(boolean z10) {
        int i6;
        int i10;
        int i11;
        this.o0 = z10;
        int i12 = 8;
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.M.getText());
        this.Q.setVisibility(i6);
        v(!isEmpty);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.N.setVisibility(i10);
        ImageView imageView = this.f772d0;
        if (imageView.getDrawable() != null && !this.f782n0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        r();
        if (this.f789v0 && !this.o0 && isEmpty) {
            this.R.setVisibility(8);
            i12 = 0;
        }
        this.T.setVisibility(i12);
        u();
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends o {
        public int B;
        public SearchView C;
        public boolean D;
        public final d E;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.E = new d(this);
            this.B = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i6 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i6 < 600) {
                if (i6 < 640 || i10 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.F0;
            fVar.getClass();
            f.a();
            Method method = fVar.f9732c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.B > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // p.o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.D) {
                d dVar = this.E;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i6, Rect rect) {
            super.onFocusChanged(z10, i6, rect);
            SearchView searchView = this.C;
            searchView.w(searchView.o0);
            searchView.post(searchView.C0);
            if (searchView.M.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i6, KeyEvent keyEvent) {
            if (i6 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.C.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i6, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.C.hasFocus() && getVisibility() == 0) {
                this.D = true;
                Context context = getContext();
                f fVar = SearchView.F0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.E;
            if (!z10) {
                this.D = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.D = false;
                    removeCallbacks(dVar);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.D = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.C = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i6) {
            super.setThreshold(i6);
            this.B = i6;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(u2 u2Var) {
    }

    public void setOnSuggestionListener(w2 w2Var) {
    }
}
