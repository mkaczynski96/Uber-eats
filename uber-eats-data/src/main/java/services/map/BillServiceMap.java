package services.map;

import model.Bill;
import org.springframework.stereotype.Service;
import services.BillService;

import java.util.Set;

@Service
public class BillServiceMap extends AbstractMapService<Bill,Long> implements BillService {
    @Override
    public Set<Bill> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Bill object) {
        super.delete(object);
    }

    @Override
    public Bill save(Bill object) {
        return super.save(object);
    }

    @Override
    public Bill findById(Long id) {
        return super.findById(id);
    }
}
