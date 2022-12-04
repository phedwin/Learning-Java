import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import java.nio.file.*;

class exceptionalHandling {
    static void readFiles(String FileLocation)  {
        Path path = new Path() {
            @NotNull

            public FileSystem getFileSystem() {
                return null;
            }


            public boolean isAbsolute() {
                return false;
            }


            public Path getRoot() {
                return null;
            }


            public Path getFileName() {
                return null;
            }


            public Path getParent() {
                return null;
            }


            public int getNameCount() {
                return 0;
            }

            @NotNull

            public Path getName(int index) {
                return null;
            }

            @NotNull

            public Path subpath(int beginIndex, int endIndex) {
                return null;
            }

//            @Override
            public boolean startsWith(@NotNull Path other) {
                return false;
            }

//            @Override
            public boolean endsWith(@NotNull Path other) {
                return false;
            }


            public Path normalize() {
                return null;
            }


            public Path resolve(@NotNull Path other) {
                return null;
            }

            public Path relativize(@NotNull Path other) {
                return null;
            }

            public URI toUri() {
                return null;
            }


            public Path toAbsolutePath() {
                return null;
            }


            public Path toRealPath(@NotNull LinkOption... options) throws IOException {
                return null;
            }

            @NotNull

            public WatchKey register(@NotNull WatchService watcher, @NotNull WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws IOException {
                return null;
            }


            public int compareTo(@NotNull Path other) {
                return 0;
            }
        };

    }
    public static void main(String[] args) throws IOException {
    }
}
