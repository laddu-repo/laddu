package bg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z extends x {
    public static Long m(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // bg.x, bg.q
    public final void b(c0 source, c0 target) {
        kotlin.jvm.internal.k.e(source, "source");
        kotlin.jvm.internal.k.e(target, "target");
        try {
            Files.move(source.e(), target.e(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // bg.x, bg.q
    public final b0.e i(c0 path) {
        Path path2;
        c0 c0Var;
        Long l10;
        Long l11;
        kotlin.jvm.internal.k.e(path, "path");
        Path e10 = path.e();
        Long l12 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(e10, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(e10);
            } else {
                path2 = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                String str = c0.f1692y;
                c0Var = zb.d.t(path2.toString());
            } else {
                c0Var = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l10 = m(creationTime);
            } else {
                l10 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l11 = m(lastModifiedTime);
            } else {
                l11 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l12 = m(lastAccessTime);
            }
            return new b0.e(isRegularFile, isDirectory, c0Var, valueOf, l10, l11, l12);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // bg.x
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
