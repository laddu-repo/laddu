package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;
import okhttp3.internal.cache.DiskLruCache;
import we.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, a {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    public DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        k.d(it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        DiskLruCache.Snapshot snapshot$okhttp;
        if (this.nextSnapshot != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next != null && (snapshot$okhttp = next.snapshot$okhttp()) != null) {
                    this.nextSnapshot = snapshot$okhttp;
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot != null) {
            try {
                this.this$0.remove(snapshot.key());
                return;
            } catch (IOException unused) {
                return;
            } finally {
                this.removeSnapshot = null;
            }
        }
        throw new IllegalStateException("remove() before next()");
    }

    @Override // java.util.Iterator
    public DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            k.b(snapshot);
            return snapshot;
        }
        throw new NoSuchElementException();
    }
}
