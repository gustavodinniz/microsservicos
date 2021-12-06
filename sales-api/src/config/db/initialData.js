import Order from "../../modules/sales/model/Order.js";

export async function createInitialData() {
    await Order.collection.drop();
    await Order.create({
        products: [
            {
                productId: 1001,
                quantity: 1
            },
            {
                productId: 1002,
                quantity: 2
            },
            {
                productId: 1003,
                quantity: 2
            },
        ],
        user: {
            id: 'af7s7af87efy89a',
            name: 'Gustavo',
            email: 'gustavodinniz@hotmail.com'
        },
        status: 'APPROVED',
        createdAt: new Date(),
        updatedAt: new Date(),
    });
    await Order.create({
        products: [
            {
                productId: 1001,
                quantity: 3
            },
            {
                productId: 1003,
                quantity: 1
            },
        ],
        user: {
            id: 'ug46yi43g6ui34',
            name: 'Alberto',
            email: 'alberto@hotmail.com'
        },
        status: 'REJECTED',
        createdAt: new Date(),
        updatedAt: new Date(),
    });

    let initialData = await Order.find();
    console.info(`Initial data was created: ${JSON.stringify(initialData, undefined, 4)}`);
}