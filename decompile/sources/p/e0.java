package p;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        t0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new k7.c(clipData, 3);
            } else {
                t0.d dVar = new t0.d();
                dVar.f12336y = clipData;
                dVar.f12337z = 3;
                cVar = dVar;
            }
            t0.q0.n(textView, cVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        t0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new k7.c(clipData, 3);
        } else {
            t0.d dVar = new t0.d();
            dVar.f12336y = clipData;
            dVar.f12337z = 3;
            cVar = dVar;
        }
        t0.q0.n(view, cVar.build());
        return true;
    }
}
