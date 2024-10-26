package example.spring_labs.web;

import example.spring_labs.services.AuthorsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import example.spring_labs.data.AuthorData;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorsController {
    private final AuthorsService repository;

    List<String> allAvailableLinks;

    public AuthorsController(AuthorsService repository) {
        this.repository = repository;
        allAvailableLinks = new ArrayList<>(repository.getAllAuthors().keySet());
    }

    @ModelAttribute("links")
    public List<String> addLinks() {
        return allAvailableLinks;
    }


    @GetMapping("/{authorName}")
    public String getAuthorInfo(@PathVariable String authorName, Model model) {
        if (!allAvailableLinks.contains(authorName))
            return "author_not_found";

        AuthorData authorData = repository.getAuthor(authorName);
        model.addAttribute("info", authorData);
        return "authors_info";
    }
}
