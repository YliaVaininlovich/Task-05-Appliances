package by.company.task.service;


import by.company.task.service.impl.ClientServiceImpl;
import by.company.task.service.impl.SortLaptopImpl;
import by.company.task.service.impl.ViewAllImpl;
import by.company.task.service.impl.WarehouseServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private final ClientService clientService = new ClientServiceImpl();
    private final WarehouseService warehouseService = new WarehouseServiceImpl();
    private final ViewAll viewAll = new ViewAllImpl();
    private final SortLaptop sortLaptop = new SortLaptopImpl();


    private ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public ClientService getClientService() {
        return clientService;
    }

    public WarehouseService getWarehouseService() {
        return warehouseService;
    }

    public ViewAll getViewAll() {
        return viewAll;
    }

    public SortLaptop getSortLaptop() {
        return sortLaptop;
    }


}
