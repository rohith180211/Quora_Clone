package org.example.quoraclone.Service;

import org.example.quoraclone.DTO.tagDto;
import org.example.quoraclone.Models.Tag;
import org.example.quoraclone.Repositories.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagService {
    private final TagRepository tagRepository;
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }
    public Tag createTag(tagDto tagDto) {
        Tag tag = new Tag();
        tag.setName(tagDto.getName());
        return tagRepository.save(tag);
    }
    public void deleteTag(Long tagId) {
        tagRepository.deleteById(tagId);
    }
    public Optional<Tag> getTagById(Long tagId) {
        return tagRepository.findById(tagId);
    }
}
