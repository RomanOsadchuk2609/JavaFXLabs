import org.junit.Assert;
import org.junit.Test;

public class BooleanOperationsTest {
    BooleanOperations booleanOperation = new BooleanOperations();
    //*****************************************************************************
    //Test Conjuction
    //*****************************************************************************

    @Test
    public void whenValue1TrueValue2TrueThenConjuctionTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1FalseValue2TrueThenConjuctionFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1TrueValue2FalseThenConjuctionFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1FalseValue2FalseThenConjuctionFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1FalseValue2NullThenConjuctionFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1NullValue2FalseThenConjuctionFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1TrueValue2NullThenConjuctionNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1NullValue2TrueThenConjuctionNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.conjunction());
    }
    @Test
    public void whenValue1NullValue2NullThenConjuctionNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.conjunction());
    }

    //*****************************************************************************
    //Test Disjuction
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenDisjuctionTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1FalseValue2TrueThenDisjuctionTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1TrueValue2FalseThenDisjuctionTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1FalseValue2FalseThenDisjuctionFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1FalseValue2NullThenDisjuctionNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1NullValue2FalseThenDisjuctionNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1TrueValue2NullThenDisjuctionTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1NullValue2TrueThenDisjuctionTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.disjunction());
    }
    @Test
    public void whenValue1NullValue2NullThenDisjuctionNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.disjunction());
    }

    //*****************************************************************************
    //Test Equality
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenEqualityTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.equality());
    }
    @Test
    public void whenValue1FalseValue2TrueThenEqualityFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.equality());
    }
    @Test
    public void whenValue1TrueValue2FalseThenEqualityFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.equality());
    }
    @Test
    public void whenValue1FalseValue2FalseThenEqualityTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.equality());
    }
    @Test
    public void whenValue1FalseValue2NullThenEqualityNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.equality());
    }
    @Test
    public void whenValue1NullValue2FalseThenEqualityNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.equality());
    }
    @Test
    public void whenValue1TrueValue2NullThenEqualityNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.equality());
    }
    @Test
    public void whenValue1NullValue2TrueThenEqualityNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.equality());
    }
    @Test
    public void whenValue1NullValue2NullThenEqualityNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.equality());
    }

    //*****************************************************************************
    //Test ExclusiveOr
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenExclusiveOrFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1FalseValue2TrueThenExclusiveOrTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1TrueValue2FalseThenExclusiveOrTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1FalseValue2FalseThenExclusiveOrFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1FalseValue2NullThenExclusiveOrNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1NullValue2FalseThenExclusiveOrNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1TrueValue2NullThenExclusiveOrNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1NullValue2TrueThenExclusiveOrNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.exclusiveOr());
    }
    @Test
    public void whenValue1NullValue2NullThenExclusiveOrNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.exclusiveOr());
    }

    //*****************************************************************************
    //Test NotOr
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenNotOrFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notOr());
    }
    @Test
    public void whenValue1FalseValue2TrueThenNotOrFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notOr());
    }
    @Test
    public void whenValue1TrueValue2FalseThenNotOrFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.notOr());
    }
    @Test
    public void whenValue1FalseValue2FalseThenNotOrTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notOr());
    }
    @Test
    public void whenValue1FalseValue2NullThenNotOrNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notOr());
    }
    @Test
    public void whenValue1NullValue2FalseThenNotOrNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.notOr());
    }
    @Test
    public void whenValue1TrueValue2NullThenNotOrFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.notOr());
    }
    @Test
    public void whenValue1NullValue2TrueThenNotOrFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notOr());
    }
    @Test
    public void whenValue1NullValue2NullThenNotOrNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notOr());
    }

    //*****************************************************************************
    //Test NotAnd
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenNotAndFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1FalseValue2TrueThenNotAndTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1TrueValue2FalseThenNotAndTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1FalseValue2FalseThenNotAndTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1FalseValue2NullThenNotAndTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1NullValue2FalseThenNotAndTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1TrueValue2NullThenNotAndNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1NullValue2TrueThenNotAndNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.notAnd());
    }
    @Test
    public void whenValue1NullValue2NullThenNotAndNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notAnd());
    }

    //*****************************************************************************
    //Test Implication
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenImplicationTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.implication());
    }
    @Test
    public void whenValue1FalseValue2TrueThenImplicationTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.implication());
    }
    @Test
    public void whenValue1TrueValue2FalseThenImplicationFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.implication());
    }
    @Test
    public void whenValue1FalseValue2FalseThenImplicationTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.implication());
    }
    @Test
    public void whenValue1FalseValue2NullThenImplicationTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.implication());
    }
    @Test
    public void whenValue1NullValue2FalseThenImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.implication());
    }
    @Test
    public void whenValue1TrueValue2NullThenImplicationNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.implication());
    }
    @Test
    public void whenValue1NullValue2TrueThenImplicationTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.implication());
    }
    @Test
    public void whenValue1NullValue2NullThenImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.implication());
    }

    //*****************************************************************************
    //Test ConverseImplication
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenConverseImplicationTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1FalseValue2TrueThenConverseImplicationFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1TrueValue2FalseThenConverseImplicationTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1FalseValue2FalseThenConverseImplicationTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1FalseValue2NullThenConverseImplicationNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1NullValue2FalseThenConverseImplicationTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1TrueValue2NullThenConverseImplicationTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1NullValue2TrueThenConverseImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.converseImplication());
    }
    @Test
    public void whenValue1NullValue2NullThenConverseImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.converseImplication());
    }

    //*****************************************************************************
    //Test notImplication
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenNotImplicationFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1FalseValue2TrueThenNotImplicationFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1TrueValue2FalseThenNotImplicationTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1FalseValue2FalseThenNotImplicationFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1FalseValue2NullThenNotImplicationFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1NullValue2FalseThenNotImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1TrueValue2NullThenNotImplicationNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1NullValue2TrueThenNotImplicationFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notImplication());
    }
    @Test
    public void whenValue1NullValue2NullThenNotImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notImplication());
    }

    //*****************************************************************************
    //Test NotConverseImplication
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenNotConverseImplicationFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1FalseValue2TrueThenNotConverseImplicationTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1TrueValue2FalseThenNotConverseImplicationFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1FalseValue2FalseThenNotConverseImplicationFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1FalseValue2NullThenNotConverseImplicationNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1NullValue2FalseThenNotConverseImplicationFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1TrueValue2NullThenNotConverseImplicationFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1NullValue2TrueThenNotConverseImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.notConverseImplication());
    }
    @Test
    public void whenValue1NullValue2NullThenNotConverseImplicationNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notConverseImplication());
    }

    //*****************************************************************************
    //Test repeatTheFirstArgument
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenRepeatTheFirstArgumentTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1FalseValue2TrueThenRepeatTheFirstArgumentFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1TrueValue2FalseThenRepeatTheFirstArgumentTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1FalseValue2FalseThenRepeatTheFirstArgumentFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1FalseValue2NullThenRepeatTheFirstArgumentFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1NullValue2FalseThenRepeatTheFirstArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1TrueValue2NullThenRepeatTheFirstArgumentTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1NullValue2TrueThenRepeatTheFirstArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.repeatTheFirstArgument());
    }
    @Test
    public void whenValue1NullValue2NullThenRepeatTheFirstArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.repeatTheFirstArgument());
    }

    //*****************************************************************************
    //Test repeatTheSecondArgument
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenRepeatTheSecondArgumentTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1FalseValue2TrueThenRepeatTheSecondArgumentTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1TrueValue2FalseThenRepeatTheSecondArgumentFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1FalseValue2FalseThenRepeatTheSecondArgumentFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1FalseValue2NullThenRepeatTheSecondArgumentNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1NullValue2FalseThenRepeatTheSecondArgumentFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1TrueValue2NullThenRepeatTheSecondArgumentNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1NullValue2TrueThenRepeatTheSecondArgumentTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.repeatTheSecondArgument());
    }
    @Test
    public void whenValue1NullValue2NullThenRepeatTheSecondArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.repeatTheSecondArgument());
    }

    //*****************************************************************************
    //Test notTheFirstArgument
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenNotTheFirstArgumentFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1FalseValue2TrueThenNotTheFirstArgumentTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1TrueValue2FalseThenNotTheFirstArgumentFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1FalseValue2FalseThenNotTheFirstArgumentTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1FalseValue2NullThenNotTheFirstArgumentTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1NullValue2FalseThenNotTheFirstArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertNull(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1TrueValue2NullThenNotTheFirstArgumentFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1NullValue2TrueThenNotTheFirstArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertNull(booleanOperation.notTheFirstArgument());
    }
    @Test
    public void whenValue1NullValue2NullThenNotTheFirstArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notTheFirstArgument());
    }

    //*****************************************************************************
    //Test notTheSecondArgument
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenNotTheSecondArgumentFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1FalseValue2TrueThenNotTheSecondArgumentFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1TrueValue2FalseThenNotTheSecondArgumentTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1FalseValue2FalseThenNotTheSecondArgumentTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1FalseValue2NullThenNotTheSecondArgumentNull() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1NullValue2FalseThenNotTheSecondArgumentTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1TrueValue2NullThenNotTheSecondArgumentNull() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1NullValue2TrueThenNotTheSecondArgumentFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.notTheSecondArgument());
    }
    @Test
    public void whenValue1NullValue2NullThenNotTheSecondArgumentNull() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertNull(booleanOperation.notTheSecondArgument());
    }

    //*****************************************************************************
    //Test constTrue
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenConstTrue()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1FalseValue2TrueThenConstTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1TrueValue2FalseThenConstTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1FalseValue2FalseThenConstTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1FalseValue2NullThenConstTrue() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1NullValue2FalseThenConstTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1TrueValue2NullThenConstTrue() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1NullValue2TrueThenConstTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertTrue(booleanOperation.constTrue());
    }
    @Test
    public void whenValue1NullValue2NullThenConstTrue() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertTrue(booleanOperation.constTrue());
    }

    //*****************************************************************************
    //Test constFalse
    //*****************************************************************************
    @Test
    public void whenValue1TrueValue2TrueThenConstFalse()throws Exception{
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1FalseValue2TrueThenConstFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1TrueValue2FalseThenConstFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1FalseValue2FalseThenConstFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1FalseValue2NullThenConstFalse() throws Exception {
        booleanOperation.setValue1(false);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1NullValue2FalseThenConstFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(false);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1TrueValue2NullThenConstFalse() throws Exception {
        booleanOperation.setValue1(true);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1NullValue2TrueThenConstFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(true);
        Assert.assertFalse(booleanOperation.constFalse());
    }
    @Test
    public void whenValue1NullValue2NullThenConstFalse() throws Exception {
        booleanOperation.setValue1(null);
        booleanOperation.setValue2(null);
        Assert.assertFalse(booleanOperation.constFalse());
    }

}
