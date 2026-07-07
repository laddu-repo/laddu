package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f840x;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f840x = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f840x;
        if (searchAutoComplete.D) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.D = false;
        }
    }
}
