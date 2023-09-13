package server.file;

import java.util.List;

public interface FileMetadataRepository {

    FileDto findById(long id);
    List<FileDto> findMany(int offset, int size);
    void save(FileDto fileMetadata);
    void update(FileDto fileMetadata);
    void delete(long id);
}