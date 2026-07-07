package p;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.internal.measurement.b4;
import com.playfy.tv.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a3 extends x0.a implements View.OnClickListener {
    public static final /* synthetic */ int U = 0;
    public final int E;
    public final int F;
    public final LayoutInflater G;
    public final SearchView H;
    public final SearchableInfo I;
    public final Context J;
    public final WeakHashMap K;
    public final int L;
    public int M;
    public ColorStateList N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;

    public a3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f14455y = true;
        this.f14456z = null;
        this.f14454x = false;
        this.A = -1;
        this.B = new b4(this);
        this.C = new c2(this, 2);
        this.F = suggestionRowLayout;
        this.E = suggestionRowLayout;
        this.G = (LayoutInflater) context.getSystemService("layout_inflater");
        this.M = 1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.H = searchView;
        this.I = searchableInfo;
        this.L = searchView.getSuggestionCommitIconResId();
        this.J = context;
        this.K = weakHashMap;
    }

    public static String h(Cursor cursor, int i6) {
        if (i6 == -1) {
            return null;
        }
        try {
            return cursor.getString(i6);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    @Override // x0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a3.a(android.view.View, android.database.Cursor):void");
    }

    @Override // x0.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.O = cursor.getColumnIndex("suggest_text_1");
                this.P = cursor.getColumnIndex("suggest_text_2");
                this.Q = cursor.getColumnIndex("suggest_text_2_url");
                this.R = cursor.getColumnIndex("suggest_icon_1");
                this.S = cursor.getColumnIndex("suggest_icon_2");
                this.T = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // x0.a
    public final String c(Cursor cursor) {
        String h4;
        String h10;
        if (cursor != null) {
            String h11 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (h11 != null) {
                return h11;
            }
            SearchableInfo searchableInfo = this.I;
            if (searchableInfo.shouldRewriteQueryFromData() && (h10 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return h10;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (h4 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return h4;
            }
            return null;
        }
        return null;
    }

    @Override // x0.a
    public final View d(ViewGroup viewGroup) {
        View inflate = this.G.inflate(this.E, viewGroup, false);
        inflate.setTag(new z2(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.L);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.J.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a3.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(suggestAuthority).query(HttpUrl.FRAGMENT_ENCODE_SET).fragment(HttpUrl.FRAGMENT_ENCODE_SET);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.J.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // x0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i6, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.G.inflate(this.F, viewGroup, false);
            if (inflate != null) {
                ((z2) inflate.getTag()).f10437a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // x0.a, android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i6, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View d10 = d(viewGroup);
            ((z2) d10.getTag()).f10437a.setText(e10.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f14456z;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f14456z;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.H.p((CharSequence) tag);
        }
    }
}
