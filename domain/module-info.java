module example.org.hexagonal.domain {
    requires lombok;

    exports example.org.hexagonal.domain.data;
    exports example.org.hexagonal.domain.repo;
    exports example.org.hexagonal.domain.services;
}