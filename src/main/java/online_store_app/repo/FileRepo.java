package online_store_app.repo;

import online_store_app.model.WebFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface FileRepo extends JpaRepository<WebFile, String> {

    }

