const shippingCosts = { standard: 6, discounted: 4 };

function calculateShipping(total) {
    let cost = total <= 10 ? shippingCosts.standard : total <= 20 ? shippingCosts.discounted : 0;
    console.log(`Fragtomkostninger: ${cost} for en totalpris på ${total}`);
}

// Simulering af indkøb
calculateShipping(10); // Første køb
calculateShipping(19); // Mere i indkøbskurven
calculateShipping(24); // Bestilling klar
