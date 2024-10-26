package example.spring_labs.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorData {
    private String name;
    private String mainRole;
    private String description;
    private String photoPath;
    private String currentPage;
}
