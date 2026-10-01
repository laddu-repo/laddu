package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        k.e(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, bg.k sink, long j10) {
        k.e(sink, "sink");
        if (j10 >= 0) {
            long j11 = j;
            long j12 = j10;
            while (j12 > 0) {
                long transferTo = this.fileChannel.transferTo(j11, j12, sink);
                j11 += transferTo;
                j12 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, bg.k source, long j10) {
        k.e(source, "source");
        if (j10 >= 0 && j10 <= source.f1726y) {
            long j11 = j;
            long j12 = j10;
            while (j12 > 0) {
                long transferFrom = this.fileChannel.transferFrom(source, j11, j12);
                j11 += transferFrom;
                j12 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
