package gc;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
import androidx.emoji2.text.v;
import com.livxow.tv.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5806a;

    public g(MainActivity mainActivity) {
        this.f5806a = mainActivity;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        MainActivity mainActivity = this.f5806a;
        SearchView searchView = mainActivity.f3634c0;
        if (searchView == null || !searchView.hasFocus() || TextUtils.isEmpty(mainActivity.f3634c0.getQuery())) {
            new Handler(Looper.getMainLooper()).postDelayed(new v(18, this), 100L);
            return true;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) mainActivity.getSystemService("input_method");
        View currentFocus = mainActivity.getCurrentFocus();
        if (currentFocus != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        mainActivity.f3634c0.clearFocus();
        return false;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
