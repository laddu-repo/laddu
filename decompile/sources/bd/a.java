package bd;

import android.os.AsyncTask;
import androidx.lifecycle.j1;
import j4.b0;

/* loaded from: classes.dex */
public abstract class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public j1 f1659a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f1660b;

    public a(b0 b0Var) {
        this.f1660b = b0Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        j1 j1Var = this.f1659a;
        if (j1Var != null) {
            j1Var.A = null;
            j1Var.d();
        }
    }
}
