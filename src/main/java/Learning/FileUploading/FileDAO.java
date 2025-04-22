package Learning.FileUploading;




import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class FileDAO {

    private static final EntityManagerFactory emf;

    // Static block to initialize EntityManagerFactory once
    static {
        emf = Persistence.createEntityManagerFactory("myJpaUnit");
    }

    public void saveFile(UploadedFile file) {
        EntityManager em = null;

        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(file);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Optional: method to close factory when app shuts down
    public static void closeFactory() {
        if (emf != null) {
            emf.close();
        }
    }
}
