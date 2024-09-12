package br.com.thalesnishida.movies.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {

    private String id;
    private String name;
    private String description;
    private boolean active;
    private Instant created;
    private Instant updated;
    private Instant deleted;

    private Category(
            final String id,
            final String name,
            final String description,
            final boolean active,
            final Instant created,
            final Instant updated,
            final Instant deleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.created = created;
        this.updated = updated;
        this.deleted = deleted;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean aActive) {
        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, aActive, now, now, null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreated() {
        return created;
    }

    public Instant getUpdated() {
        return updated;
    }

    public Instant getDeleted() {
        return deleted;
    }
}
