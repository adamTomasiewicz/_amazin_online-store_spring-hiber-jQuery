package online_store_app.responses;

public class DownloadResponse {

        private String fileName;
        private String fileType;
        private long fileSize;
        private String fileUrl;

        public DownloadResponse(String fileName, String fileType, long fileSize, String fileUrl) {
            this.fileName = fileName;
            this.fileType = fileType;
            this.fileSize = fileSize;
            this.fileUrl = fileUrl;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileType() {
            return fileType;
        }

        public void setFileType(String fileType) {
            this.fileType = fileType;
        }

        public long getFileSize() {
            return fileSize;
        }

        public void setFileSize(long fileSize) {
            this.fileSize = fileSize;
        }

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }
    }

