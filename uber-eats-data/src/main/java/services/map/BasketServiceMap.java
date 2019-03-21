package services.map;

import model.Basket;
import services.BasketService;
import java.util.Set;

public class BasketServiceMap extends AbstractMapService<Basket, Long> implements BasketService {
    @Override
    public Set<Basket> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Basket object) {
        super.delete(object);
    }

    @Override
    public Basket save(Basket object) {
        return super.save(object);
    }

    @Override
    public Basket findById(Long id) {
        return super.findById(id);
    }
}
